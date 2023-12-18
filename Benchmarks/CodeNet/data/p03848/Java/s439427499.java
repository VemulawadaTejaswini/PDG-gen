import java.math.BigInteger;
import java.util.Scanner;


class Solver {

    private final int[] A;
    private final int N;

    Solver(Scanner in) {
        N = in.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
    }

    void solve() {
        int[] count = new int[N];
        count[0]++;
        for (int a : A) {
            count[a]++;
            if (count[a] >= 3) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(BigInteger.valueOf(2).modPow(BigInteger.valueOf(N / 2), BigInteger.valueOf(1000000007)).intValue());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}