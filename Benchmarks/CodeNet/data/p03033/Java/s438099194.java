import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

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

            TreeMap<Integer, Integer> D = new TreeMap<>();
            for (int i = 0; i < Q; i++) {
                D.put(sc.nextInt(), i);
            }

            int[] A = new int[Q];
            Arrays.fill(A, -1);

            for (int i = 0; i < N; i++) {
                int s = W[i][0];
                int t = W[i][1];
                int x = W[i][2];

                while (true) {
                    Integer key = D.ceilingKey(s - x);
                    if (key == null) {
                        break;
                    }

                    if (key >= t - x) {
                        break;
                    }

                    A[D.get(key)] = x;
                    D.remove(key);
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
