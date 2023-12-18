import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            long a = combination(n - k + 1, i) * combination(k - 1, i - 1);
            System.out.println(a % (long) (Math.pow(10, 9) + 7));
        }
    }

    private static long combination(int n, int k) {
        long result = 1;

        for (int i = n; i > n - k; i--) {
            result *= i;
        }
        for (int i = k; i > 0; i--) {
            result /= i;
        }

        return result;
    }
}
