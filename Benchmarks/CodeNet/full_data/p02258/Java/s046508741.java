import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        final Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[1] - numbers[0];
        int min = numbers[0];
        for (int i = 1; i < length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                continue;
            }

            if (numbers[i] - min > max) {
                max = numbers[i] - min;
            }
        }

        System.out.println(max);
    }
}
