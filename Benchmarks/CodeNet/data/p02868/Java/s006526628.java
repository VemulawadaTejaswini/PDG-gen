import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            Pair p = new Pair();
            p.L = scan.nextInt()-1;
            p.R = scan.nextInt()-1;
            p.C = scan.nextInt();
            list.add(p);
        }
        list.sort(new PairComparator());
        long[] dp = new long[N+1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[N-1] = 0;
        for (int i = 0; i < list.size(); i++) {
            Pair p = list.get(i);
            int l = p.L;
            int r = p.R;
            if (dp[p.R] == Long.MAX_VALUE) {
                continue;
            }
            for (int t = p.R-1; p.L <= t; t--) {
                dp[t] = Math.min(dp[t], dp[p.R]+p.C);
            }
        }
        if (dp[0]== Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[0]);
        }
    }
    class Pair {
        int L;
        int R;
        long C;
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.R != o2.R) {
                return -Integer.compare(o1.R, o2.R);
            }
            if (o1.L != o2.L) {
                return -Integer.compare(o1.L, o2.L);
            }
            return Long.compare(o1.C, o2.C);
        }
    }
}
