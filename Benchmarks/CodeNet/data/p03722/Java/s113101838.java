import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static Edge[] edges;
    static long[] d;
    static long INF = Long.MAX_VALUE;
    static boolean isGameEstablish = true;
    static HashMap<Integer, Long> counter;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        counter = new HashMap<>();
        edges = new Edge[M];
        for(int i = 0; i < M; i++) {
            int from = scanner.nextInt() - 1;
            int to = scanner.nextInt() - 1;
            long cost = -scanner.nextLong();
            Edge e = new Edge(from, to, cost);
            edges[i] = e;
            counter.put(from, (long) 0);
        }

        d = new long[N];
        Arrays.fill(d, INF);

        scanner.close();
    }

    private static void bellmanFord(int s) {
        d[s] = 0;
        for(int i = 0; i < N; i++) {
            boolean update = false;
            for(int j = 0; j < M; j++) {
                Edge e = edges[j];
                if(d[e.from] != INF && d[e.from] + e.cost < d[e.to]) {
                    d[e.to] = d[e.from] + e.cost;
                    update = true;
                    long count = counter.get(e.from);
                    count++;
                    counter.put(e.from, count);
                }
                long count = counter.get(e.from);
                if(e.to == N - 1 && 2 <= count && i == N - 1) { // N - 1に向う頂点で、二回以上ループしているものは閉路
                    isGameEstablish = false;
                    break;
                }
            }
            if(!update) break;
        }
    }

    public static void main(String args[]) {
        init();
        bellmanFord(0);
        long ans = -d[N - 1];

        bellmanFord(0); // もう1回bellmanFord回して、Nの頂点の結果が変わって入ればスコアに関わる閉路がある
        if(ans == -d[N - 1] && isGameEstablish) {
            System.out.println(ans);
        } else {
            System.out.println("inf");
        }
    }
}

class Edge {
    int from;
    int to;
    long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}