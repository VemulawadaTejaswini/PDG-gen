import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solve2(N, a) ? YES : NO);
    }

    /**
     * Petr解を参考: https://atcoder.jp/contests/agc035/submissions/6371518
     * PairやArrayListを使わないので実装量が少なくて済む
     */
    private static boolean solve2(int N, int[] a) {
        Arrays.sort(a);

        if (N%3 != 0) {
            if (a[0] == 0 && a[N-1] == 0) return true;

            return false;
        }

        int p = N/3;
        if (a[0] == 0 && a[p-1] == 0 && a[p] == a[N-1]) return true;
        if (a[0] == a[p-1] && a[p] == a[2*p-1] && a[2*p] == a[N-1] && (a[0] ^ a[p] ^ a[2*p]) == 0) return true;

        return false;
    }
}