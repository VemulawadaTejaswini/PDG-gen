import java.util.*;
import java.io.*;

/*
3 8
3 30
4 50
5 60

90
 */
public class Main {
    static long[][] mindist;
    static int[][] graph;

    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int M = scanner.nextInt();

        int N = nextInt();
        int M = nextInt();
        mindist = new long[110][110110]; // nowまでの最小のコスト
        graph = new int[110][110];

        // dp[0][0] = 0
        for (long[] m : mindist) {
            Arrays.fill(m, 0);
        }

        for (int[] g : graph) {
            Arrays.fill(g, 0);
        }

        // graph for input
        for (int i = 0; i < N; i++) {
            // scanner
            int w = nextInt();
            int v = nextInt();

            graph[i][0] = w; // weight
            graph[i][1] = v; // cost
        }

        for (int i = 0; i < N; i++) { // next_id
            for (int weight = 0; weight <= M; weight++) { // weight
                // buy
                if (weight >= graph[i][0]) {
                    mindist[i + 1][weight] =
                            Math.max(mindist[i + 1][weight], mindist[i][weight - graph[i][0]] + graph[i][1]);
                }

                // not buy
                mindist[i + 1][weight] = Math.max(mindist[i + 1][weight], mindist[i][weight]);
            }
        }

        System.out.println(mindist[N][M]);
    }

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}