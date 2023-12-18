import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] a = new int[n][m];
        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }

        Map<Integer, Map.Entry<Integer, Integer>> map = createIndex(a);
        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                int targetNum = m * i + j + 1;
                Map.Entry<Integer, Integer> pos = map.get(targetNum);

                // out.println("Swapping " + pos.getKey() + " " + j + ", " + pos.getKey() + " " + pos.getValue());
                swap(a, pos.getKey(), j, pos.getKey(), pos.getValue());
            }
            map = createIndex(a);
        }

        println(a);

        for (int j=0; j < m; j++) {
            for (int i=0; i < n; i++) {

                for (int h=0; h < n; h++) {
                    if ((a[h][j] - 1) / m == i) {
                        swap(a, h, j, i, j);
                        break;
                    }
                }

            }
        }

        println(a);

    }

    private static Map<Integer, Map.Entry<Integer, Integer>> createIndex(int[][] a) {
        Map<Integer, Map.Entry<Integer, Integer>> map = new HashMap<>();
        for (int i=0; i < a.length; i++) {
            for (int j=0; j < a[0].length; j++) {
                map.put(a[i][j], new AbstractMap.SimpleEntry<>(i, j));
            }
        }
        return map;
    }

    private static void swap(int[][] a, int n1, int m1, int n2, int m2) {
        int temp = a[n1][m1];
        a[n1][m1] = a[n2][m2];
        a[n2][m2] = temp;
    }

    private static void println(int[][] a) {
        for (int i=0; i < a.length; i++) {
            out.println(
                    Arrays.stream(a[i]).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            );
        }
    }

}
