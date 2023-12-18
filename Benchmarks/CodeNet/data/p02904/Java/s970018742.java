import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        long[] P = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                P[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, K, P);
    }
}

class Solver {
    public void solve(long N, long K, long[] P) {

        final Deque<Integer> deque = new LinkedList<>();
        long ans = 1;
        for (int i = 0; i < N; i++) {
            while (!deque.isEmpty() && P[deque.peekLast()] >= P[i]) {
                deque.removeLast();
            }
            deque.addLast(i);

            if (i >= K + 1) {
                int index = (int) (i - K);
                boolean isEquivalent = deque.peekFirst() == index && deque.peekLast() == i + 1;
                if (!isEquivalent) {
                    ans++;
                }

                if (deque.peekFirst() == index) {
                    deque.removeFirst();
                }
            }
        }
        System.out.println(ans);
    }
}

