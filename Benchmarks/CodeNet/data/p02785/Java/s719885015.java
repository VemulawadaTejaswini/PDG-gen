import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        List<Long> H = new LinkedList<>();
        for(int i = 0 ; i < N ; i++){
                H.add(sc.nextLong());
        }

        final Solver solver = new Solver();
        solver.solve(N, K, H);
    }
}

class Solver {
    public void solve(long N, long K, List<Long> H) {
        H.sort(Collections.reverseOrder());

        long ans = 0;
        for (int i = (int) K; i < N; i++) {
            ans += H.get(i);
        }
        System.out.println(ans);
    }
}

