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
        for (int i = length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int diff = numbers[i] - numbers[j];
                if (diff >= max) {
                    max = diff;
                }
            }
        }

        System.out.println(max);
    }
}

