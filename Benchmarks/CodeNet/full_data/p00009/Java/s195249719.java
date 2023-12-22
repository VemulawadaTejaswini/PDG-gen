import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = 1000000;
        boolean[] primes = new boolean[N];
        for (int i = 2; i < N; i++) {
            primes[i] = true;
        }

        for (int i = 2; i < N; i++) {
            if (i * i > N) {
                break;
            }
            if (primes[i]) {
                for (int j = i + i; j < N; j += i) {
                    primes[j] = false;
                }
            }
        }

        while (in.hasNext()) {
            // 1 ??? n ??? 999,999
            int n = in.nextInt();
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (primes[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}