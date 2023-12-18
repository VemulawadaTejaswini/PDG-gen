import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static long[][] dp;
    static long[] mindp;

    // 頂点番号，各頂点から出る複数のエッジ
    static List<Edge>[] graph;

    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int M = nextInt();

        dp = new long[N][N];
        mindp = new long[N];

        for (long[] longs : dp) {
            Arrays.fill(longs, 0);
        }
        Arrays.fill(mindp, 0);

        // 入力値を受け取りグラフ作成
        graph = new List[N]; // 頂点数
        for (int i = 0; i < M; i++) {
            // scanner
            int x = nextInt() - 1;
            int y = nextInt() - 1;

            // graphにadd
            graph[x] = new ArrayList<>();
            graph[x].add(new Edge(y, 1));
        }

        // dp
        dijkstra(0);

        // result
        System.out.println(mindp[N - 1]);
    }

    static void dijkstra(int v) {
        //頂点を、出発点からの距離が近い順に取得できるPriorityQueueを用意
        PriorityQueue<Vertex> pq = new PriorityQueue<>(
                ((v1, v2) -> v1.dist < v2.dist ? -1 : 1)
        );

        // 出発頂点をQueueに格納する
        pq.add(new Vertex(v, mindp[v]));
        while (!pq.isEmpty()) {
            // 次に扱う頂点を取り出す
            Vertex now = pq.poll();
//            System.out.println(now.id + "->" + now.dist);

            // 後から新しく更新されて、見る必要がない場合
//            if (now.dist > mindp[now.id]) {
//                continue;
//            }

            //頂点から出るエッジ全てを見て、接続先の頂点のコストをより大きくできるなら更新
            try {
                for (Edge edge : graph[now.id]) {
                    if (mindp[edge.to] < mindp[now.id] + edge.cost) {
                        mindp[edge.to] = mindp[now.id] + edge.cost;
                        pq.add(new Vertex(edge.to, mindp[edge.to]));
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    static char nextChar() throws IOException {
        return next().charAt(0);
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static int[] readArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int Char2Int(Character c) {
        return Character.getNumericValue(c);
    }

    static double Char2Double(Character c) {
        return (double) Char2Int(c);
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            a = a % b; // 残り部分
            return gcd(b, a); // 残り部分から最小の正方形を見つける
        }
    }
}