import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        List<Long> p = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
                p.add(sc.nextLong());
        }

        final Solver solver = new Solver();
        solver.solve(N, K, p);
    }
}

class Solver {
    public void solve(long N, long K, List<Long> p) {
        double ans = -1.0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            long v = p.get(i);
            sum += (double) sum(v) / v;

            if (i >= K - 1) {
                if (ans < sum) {
                    ans = sum;
                }
                long u = p.get((int) (i - (K - 1)));
                sum -= (double) sum(u) / u;
            }
        }

        System.out.println(ans);
    }

    public long sum(Long to) {
        return to * (to + 1) / 2;
    }
}

