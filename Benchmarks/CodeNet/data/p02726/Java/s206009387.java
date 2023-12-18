import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        static DLine.Node[] graph;
        static boolean[] visited;
        static int n;
        static int[] ans;

        static void bfs(int a) {
            visited[a] = true;
            LinkedList<DLine.Pair> list = new LinkedList<>();
            list.push(new DLine.Pair(a, 0));
            while (!list.isEmpty()) {
                DLine.Pair act = list.pollFirst();
                if (act.y <= n) {
                    ans[act.y]++;
                }
                for (int i : graph[act.x].edges) {
                    if (!visited[i]) {
                        visited[i] = true;
                        list.addLast(new DLine.Pair(i, act.y + 1));
                    }
                }
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            n = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            graph = new DLine.Node[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new DLine.Node();
                graph[i].edges = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                graph[i].edges.add(i + 1);
                graph[i + 1].edges.add(i);
            }
            graph[x].edges.add(y);
            graph[y].edges.add(x);
            ans = new int[n + 1];
            for (int i = 0; i < n; i++) {
                visited = new boolean[n];
                bfs(i);
            }
            for (int i = 1; i < n; i++) {
                out.println(ans[i] / 2);
            }
        }

        static class Node {
            ArrayList<Integer> edges;

        }

        static class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

