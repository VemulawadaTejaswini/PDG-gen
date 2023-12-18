import java.util.Scanner;

public class Main {
    private static final long mod = (int) (1e9 + 7);

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = Integer.parseInt(in.nextLine());
            run(N);
        }
    }

    private static void run(int N) {
        int[] countDivisor = new int[N + 1];
        for (int number = 1; number <= N; number++) {

            int n = number;
            for (int divisor = 2; divisor <= n; divisor++) {
                while (n % divisor == 0) {
                    countDivisor[divisor]++;
                    n /= divisor;
                }
            }

        }

        long numDivisors = 1;
        for (int i = 2; i <= N; i++) {
            numDivisors *= (1 + countDivisor[i]);
            numDivisors = numDivisors % mod;
        }

        System.out.println(numDivisors);
    }
}
