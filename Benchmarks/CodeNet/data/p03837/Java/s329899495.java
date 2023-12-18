import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    int n, m;
    long[][] distances;
    long INF = 1 << 60;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        m = sc.nextInt();
        distances = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    distances[i][j] = INF;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            int cost = sc.nextInt();
            distances[from][to] = cost;
            distances[to][from] = cost;
        }
        solve();
    }

    void solve() {
        WarshallFloyd wf = new WarshallFloyd(distances);
        wf.shortestPathWithPath();
        /*
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (distances[j][])
                }
            }
        }
        */
        SortedSet<Pair> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i;
                while (k != j) {
                    if (k > wf.successors[k][j]) {
                        set.add(new Pair(wf.successors[k][j], k));
                    } else {
                        set.add(new Pair(k, wf.successors[k][j]));
                    }
                    k = wf.successors[k][j];
                }
                /*
                if (i == j) {
                    continue;
                }
                int small = i;
                int large = wf.successors[i][j];
                if (large < 0 || small == large) {
                    continue;
                }
                if (small > large) {
                    large = i;
                    small = wf.successors[i][j];
                }
                set.add(new Pair(small, large));
                */
            }
        }
        System.out.println(m - set.size());

    }

    class Pair implements Comparable<Pair> {
        int from;
        int to;

        Pair(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int compareTo(Pair p) {
            if (this.from == p.from) {
                return this.to - p.to;
            } else {
                return this.from - p.from;
            }
        }
    }

    public class WarshallFloyd {
        long[][] distances;
        int numVertexes;
        int[][] successors;

        WarshallFloyd(long[][] distances) {
            this.distances = distances;
            numVertexes = distances.length;
        }

        void shortestPath() {
            for (int k = 0; k < numVertexes; k++) {
                for (int i = 0; i < numVertexes; i++) {
                    for (int j = 0; j < numVertexes; j++) {
                        distances[i][j] = Math.min(distances[i][j],
                                distances[i][k] + distances[k][j]);
                    }
                }
            }
        }

        void shortestPathWithPath() {
            successors = new int[distances.length][distances.length];
            for (int i = 0; i < distances.length; i++) {
                for (int j = 0; j < distances.length; j++) {
                    if (distances[i][j] < INF) {
                        successors[i][j] = j;
                    } else {
                        successors[i][j] = -1;
                    }
                }
            }
            for (int k = 0; k < numVertexes; k++) {
                for (int i = 0; i < numVertexes; i++) {
                    for (int j = 0; j < numVertexes; j++) {
                        long newDistance = distances[i][k] + distances[k][j];
                        if (distances[i][j] > newDistance) {
                            distances[i][j] = newDistance;
                            successors[i][j] = k;
                        }
                    }
                }
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
