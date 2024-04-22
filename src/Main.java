import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Arrayin ölçüsünü daxil edin:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        int count = 0;
        while (count < size) {
            System.out.println((count + 1) + ". ədədi daxil edin:");
            int number = scanner.nextInt();

            int temp = number;
            int sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum % 2 != 0) {
                array[count] = number;
                count++;
            } else {
                System.out.println("Rəqəmlərin cəmi tək deyil. Yenidən cəhd edin.");
            }
        }

        System.out.print("Doldurulmuş array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}