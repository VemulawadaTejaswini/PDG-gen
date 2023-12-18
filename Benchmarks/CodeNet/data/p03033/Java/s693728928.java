import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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

            int[][] W = new int[N][3];
            for (int i = 0; i < N; i++) {
                W[i][0] = sc.nextInt();
                W[i][1] = sc.nextInt();
                W[i][2] = sc.nextInt();
            }

            Arrays.sort(W, (o1, o2) -> Integer.compare(o1[2], o2[2]));

            List<Integer> D = new ArrayList<Integer>();
            Map<Integer, Integer> index = new HashMap<>();
            for (int i = 0; i < Q; i++) {
                int d = sc.nextInt();
                D.add(d);
                index.put(d, i);
            }

            int[] A = new int[Q];
            Arrays.fill(A, -1);

            for (int i = 0; i < N; i++) {
                int s = W[i][0];
                int t = W[i][1];
                int x = W[i][2];

                int pos1 = Collections.binarySearch(D, s - x);
                if (pos1 < 0) {
                    pos1 = -(pos1 + 1);
                }

                int pos2 = Collections.binarySearch(D, t - x);
                if (pos2 < 0) {
                    pos2 = -(pos2 + 1);
                }

                //System.out.println(s + " " + t + " " + x + " " + pos1 + " " + pos2 + " " + D);

                if (pos1 == pos2) {
                    continue;
                }

                for (int p = pos1; p < pos2; p++) {
                    int q = D.remove(pos1);
                    A[index.get(q)] = x;
                }
            }

            StringBuilder ans = new StringBuilder();
            for (int a : A) {
                ans.append(a).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

}
