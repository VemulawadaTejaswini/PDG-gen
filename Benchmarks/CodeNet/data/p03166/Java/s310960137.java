import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    private ArrayList<Integer>[] adj;

    private void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public static void main(String[] args) {
        Main main = new Main();
        FastReader scanner = new FastReader();
        int N = scanner.nextInt();

        main.adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            main.adj[i] = new ArrayList<>();
        }

        int M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            main.addEdge(scanner.nextInt() - 1, scanner.nextInt() - 1);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            main.DFS(new boolean[N], i);
            max = Math.max(max, main.maximum);
            main.count = 0;
            main.maximum = 0;
        }
        System.out.println(max - 1);

    }

    private int count = 0;
    private int maximum = 0;

    private void DFS(boolean[] visited, int n) {
        visited[n] = true;
        count++;
        for (Integer ix : adj[n]) {
            int temp = count;
            if (!visited[ix]) {
                DFS(visited, ix);
            }
            visited[ix] = false;
            count = temp;
        }
        maximum = Math.max(count, maximum);
    }

}