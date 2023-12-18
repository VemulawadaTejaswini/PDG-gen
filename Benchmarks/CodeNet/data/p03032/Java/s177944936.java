import java.io.*;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.LongBinaryOperator;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int K;
        K = sc.nextInt();
        int[] V = new int[(N)];
        for(int i = 0 ; i < N ; i++){
                V[i] = sc.nextInt();
        }

        final Solver solver = new Solver();
        solver.solve(N, K, V);
    }
}

class Solver {
    public void solve(int N, int K, int[] V) {
        final int MIN = Math.min(N, K);

        int max = 0;

        for (int A = 0; A <= MIN; A++) {
            for (int B = 0; (A + B) <= MIN; B++) {
                int D = K - (A + B);

                final PriorityQueue<Integer> points = new PriorityQueue<>();
                for (int i = 0; i < A; i++) points.add(V[i]);
                for (int i = 0; i < B; i++) points.add(V[(N - 1) - i]);
                for (int i = 0; i < D; i++) {
                    if (points.peek() == null) break;
                    if (points.peek() < 0) points.poll();
                }

                max = Math.max(max, points.stream().reduce(0, Integer::sum));
            }
        }

        System.out.println(max);
    }
}

