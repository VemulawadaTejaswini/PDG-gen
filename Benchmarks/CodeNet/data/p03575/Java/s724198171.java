
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        Graph graph = new Graph(in.nextInt());
        int M = in.nextInt();
        for (int i = 0; i < M; i++) {
            graph.connect(in.nextInt()-1, in.nextInt()-1);
        }
        out.println(graph.check());
    }
    class Graph{
        final int MAX = 1000;
        int[][] graph;
        int width;

        public Graph(int N) {
            width = N;
            graph = new int[N][N];
            for (int i = 0 ; i < width ; i++) {
                graph[i] = new int[N];
                Arrays.fill(graph[i],MAX);
            }
        }

        public void connect(int a, int b) {
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        public int check() {
            int count = 0;
            for (int i = 0; i < width; i++) {
                for (int j = i + 1; j < width; j++) {
                    if (graph[i][j] != MAX && !floyd(i, j)) {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean floyd(int a, int b) {
            int[][] tempGraph = new int[width][width];
            for (int i = 0; i < width; i++) {
                tempGraph[i] = graph[i].clone();
            }
            tempGraph[a][b] = MAX;
            tempGraph[b][a] = MAX;
            for (int k = 0; k < width; k++) {
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < width; j++) {
                        tempGraph[i][j] = Math.min(tempGraph[i][j], tempGraph[i][k] + tempGraph[k][j]);
                    }
                }
            }
            for (int i = 1; i < width; i++) {
                if (tempGraph[0][i] == MAX) {
                    return false;
                }
            }
            return true;
        }
    }

    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}