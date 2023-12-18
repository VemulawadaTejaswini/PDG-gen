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
        for (int i = 0; i < N - K + 1; i++) {
            double s = 0;
            for (int j = 0; j < K; j++) {
                long v = p.get(i + j);
                s += (double) sum(v) / v;
            }

            if (ans < s) {
                ans = s;
            }
        }

        System.out.println(ans);
    }

    public long sum(Long to) {
        return to * (to + 1) / 2;
    }
}

