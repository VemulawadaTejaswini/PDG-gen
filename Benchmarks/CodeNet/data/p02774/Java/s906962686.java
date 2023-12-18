import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        List<Integer> S = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            S.add(sc.nextInt());
        }

        final Solver solver = new Solver();
        solver.solve(N, K, S);
    }
}

class Solver {
    public void solve(long N, long K, List<Integer> S) {

        PriorityQueue<Integer> q = new PriorityQueue<>();
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


