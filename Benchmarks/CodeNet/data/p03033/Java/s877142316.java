import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Roadwork
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int Q = sc.nextInt();

            Work[] W = new Work[N];
            for (int i = 0; i < N; i++) {
                W[i] = new Work();
                W[i].S = sc.nextInt();
                W[i].T = sc.nextInt();
                W[i].X = sc.nextInt();
            }

            Arrays.sort(W, (o1, o2) -> {
                int ret = Integer.compare(o1.X, o2.X);
                if (ret == 0) {
                    ret = Integer.compare(o1.S, o2.S);
                }
                return ret;
            });

            int[] D = new int[Q];
            Map<Integer, Integer> index = new HashMap<>();
            for (int i = 0; i < Q; i++) {
                int d = sc.nextInt();
                D[i] = d;
                index.put(d, i);
            }

            int[] A = new int[Q];
            Arrays.fill(A, -1);

            for (int i = 0; i < N; i++) {
                Work w = W[i];

                int pos1 = Arrays.binarySearch(D, w.S - w.X);
                if (pos1 < 0) {
                    pos1 = -(pos1 + 1);
                }

                int pos2 = Arrays.binarySearch(D, w.T - w.X);
                if (pos2 < 0) {
                    pos2 = -(pos2 + 1);
                }

                //System.out.println(w.S + " " + w.T + " " + w.X + " " + pos1 + " " + pos2 + " " + D);

                if (pos1 == pos2) {
                    continue;
                }

                for (int p = pos1; p < pos2; p++) {
                    int q = D[p];
                    A[index.get(q)] = w.X;
                }

                if (D.length - (pos2 - pos1) == 0) {
                    break;
                }

                int[] D2 = new int[D.length - (pos2 - pos1)];
                if (pos1 > 0) {
                    System.arraycopy(D, 0, D2, 0, pos1);
                }
                if (D.length - pos2 > 0) {
                    System.arraycopy(D, pos2, D2, pos1, D.length - pos2);
                }
                D = D2;
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < Q; i++) {
                ans.append(A[i]).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

    static class Work {

        int S;

        int T;

        int X;

    }

}
