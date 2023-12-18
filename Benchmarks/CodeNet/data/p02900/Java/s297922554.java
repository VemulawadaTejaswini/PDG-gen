import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(solve(A, B));
    }

    /**
     * https://atcoder.jp/contests/abc142/submissions/7746549
     * AとBで共通する素数の約数の個数+1が解
     * @param A
     * @param B
     * @return
     */
    private static int solve(long A, long B) {
        int count = 1;
        List<Pair> primeFactorA = primeFactorize(A);

        for (Pair p : primeFactorA) {
            // System.err.println(p.first + " ** " + p.second);
            if (B%p.first == 0) {
                count++;
            }
        }

        return count;
    }

    public static class Pair {
        long first;
        long second;

        public Pair(long a, long b) {
            this.first = a;
            this.second = b;
        }
    }

    private static List<Pair> primeFactorize(Long N) {
        List<Pair> list = new ArrayList();

        for (long p=2; p <= N; p++) {
            if (N%p != 0) continue;
            int num = 0;
            while (N%p == 0) {
                num++;
                N /= p;
            }

            list.add(new Pair(p, num));
        }

        return list;
    }
}