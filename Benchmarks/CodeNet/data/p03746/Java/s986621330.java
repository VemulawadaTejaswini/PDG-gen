import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        ArrayList<Integer> adjList [] = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adjList[i] = new ArrayList<>();

        int m = sc.nextInt();
        while (m-- > 0) {
            int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
            adjList[u].add(v);
            adjList[v].add(u);
        }

        Deque<Integer> deque = new LinkedList<>();
        deque.add(0);
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        while (true) {
            boolean ok1 = true;
            for (int nxt : adjList[deque.getFirst()]) {
                if (!set.contains(nxt)) {
                    ok1 = false;
                    deque.addFirst(nxt);
                    set.add(nxt);
                    break;
                }
            }

            boolean ok2 = true;
            for (int nxt : adjList[deque.getLast()]) {
                if (!set.contains(nxt)) {
                    ok2 = false;
                    deque.addLast(nxt);
                    set.add(nxt);
                    break;
                }
            }

            if (ok1 && ok2) break;
        }

        out.println(deque.size());
        for (int i = 0, nn = deque.size(); i < nn; i++) {
            if (i > 0) out.print(" " );
            out.print(deque.pollFirst() + 1);
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

        public Scanner(FileReader f) {
            br = new BufferedReader(f);
        }

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