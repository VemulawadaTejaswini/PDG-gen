import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int length = sc.nextInt();
        final int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        output(numbers);

        for (int i = 1; i < length; i++) {
            final int temp = numbers[i];

            int j;
            for (j = i - 1; j >= 0 && numbers[j] > temp; j--) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = temp;
            output(numbers);
        }

        sc.close();
    }

    public static void output(int[] numbers) {
        int i;
        for (i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(numbers[i]);
    }

}

