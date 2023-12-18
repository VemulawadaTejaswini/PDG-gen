import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        List<Long> S = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            S.add(sc.nextLong());
        }

        final Solver solver = new Solver();
        solver.solve(K, S);
    }
}

class Solver {
    public void solve(long K, List<Long> S) {

        PriorityQueue<Long> q = new PriorityQueue<>();
        for (int i = 0; i < S.size(); i++) {
            for (int j = i + 1; j < S.size(); j++) {
                q.add(S.get(i) * S.get(j));
            }
        }

        for (int i = 0; i < K - 1; i++) {

            q.poll();
        }
        System.out.println(q.peek());
    }
}


