import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer> adjList [];
    static int n;
    static boolean visited [];
    static ArrayList<Integer> res = new ArrayList<>();
    static void dfs (int node) {
        visited[node] = true;
        res.add(node);

        for (int child : adjList[node])
            if (!visited[child]) {
                dfs(child);
                break;
            }
    }
    static int s;
    static boolean dfs2(int node, int p) {
        visited[node] = true;
        if (node == s) return true;
        boolean ok = false;
        for (int child : adjList[node]) {
            if (child != p) {
                if (!visited[child])
                {
                    if (dfs2(child, node)) {
                        res.add(node);
                        ok = true;
                        break;
                    }
                }
            }
        }
        return ok;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        n = sc.nextInt();
        adjList = new ArrayList[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++)
            adjList[i] = new ArrayList<>();

        int m = sc.nextInt();
        while (m-- > 0) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            adjList[a].add(b);
            adjList[b].add(a);
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (adjList[i].size() == 1) {
                found = true;
                dfs(i);
                break;
            }
        }

        if (!found) {
            for (int i = 0; i < n; i++) {
                if (adjList[i].size() == 2) {
                    res.add(i);
                    s = i;
                    dfs2(adjList[i].get(0), i);
                    break;
                }
            }
        }
        out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            if (i > 0) out.print(" ");
            out.print(res.get(i) + 1);
        }
        out.println();
        out.flush();
        out.close();
    }


    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner (FileReader f) {br = new BufferedReader(f);}

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}