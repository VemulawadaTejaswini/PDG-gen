import java.util.Arrays;
import java.util.Scanner;

class Solver {

    private final int N;

    Solver(Scanner in) {
        N = in.nextInt();
    }

    void solve() {
        int[] primes = new int[N];
        for (int i = 2; i <= N; i++) {
            int j = 2;
            int x = i;
            for (; j * j <= x; j++) {
                while (x % j == 0) {
                    primes[j - 1]++;
                    x /= j;
                }
            }
            if (x != 1) primes[x - 1]++;
        }
        System.out.println(Arrays.stream(primes).mapToLong(i -> i + 1).reduce(1, (a, b) -> a * b % 1000000007));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}