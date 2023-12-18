import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        final Map<Integer, Long> counts = new HashMap<>();
        int[] A = new int[N];
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextInt();
                counts.put(A[i], 0);
        }

        final Solver solver = new Solver();
        solver.solve(N, A, counts);
    }
}

class Solver {
    public void solve(int N, int[] A, Map<Integer, Long> counts) {
        for (int i = 0; i < N; i++) {
            counts.put(A[i], counts.get(A[i]) + 1);
        }

        long total = 0;
        for (Map.Entry<Integer, Long> count : counts.entrySet()) {
            long c = count.getValue();
            total += c * (c - 1) / 2;
        }

        for (int i = 0; i < N; i++) {
            long ans = total;

            long c = counts.get(A[i]);
            ans -= c - 1;

            System.out.println(ans);
        }
    }
}

