import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    class Edge {
        int next;
        long weight;
        Edge (int n, long w) {
            next = n;
            weight = w;
        }
    }


    int n;

    private void solve() {
        try {
            n = sc.nextInt();
            byte[] visited = new byte[100001];
            List<List<Edge>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            int v;
            int u = 0;
            long w;
            int first = 0;
            for (int i = 0; i < n -1; i++) {
                u = sc.nextInt();
                v = sc.nextInt();
                w = sc.nextLong();
                Edge tmp = new Edge(v, w);
                Edge tmp2 = new Edge(u, w);
                graph.get(u).add(tmp);
                graph.get(v).add(tmp2);
            }

            for (int i = 1; i <= n; i++) {
                if (graph.get(i).size() == 1) {
                    u = i;
                }
            }

            Queue<Integer> q = new ArrayDeque<>();
            q.add(u);
            visited[u] = 1;
            while (!q.isEmpty()) {
                u = q.poll();
                for (int i = 0; i < graph.get(u).size(); i++) {
                    int vv = graph.get(u).get(i).next;
                    long ww = graph.get(u).get(i).weight;
                    if (visited[vv] == 0) {
                        q.add(vv);
                        if (visited[u] == 2) {
                            if (ww%2 == 1) visited[vv] = 1;
                            else visited[vv] = 2;
                        } else {
                            if (ww%2 == 1) visited[vv] = 2;
                            else visited[vv] = 1;
                        }
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.println(visited[i]%2);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}