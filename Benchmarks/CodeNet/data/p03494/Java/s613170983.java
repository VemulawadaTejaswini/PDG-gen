import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = -1;
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();

            int sum = 0;
            if (temp % 2 != 0) {
                break;
            }
            while (temp % 2 == 0) {
                temp /= 2;
                sum += 1;
            }
            if (max == -1 || sum < max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
