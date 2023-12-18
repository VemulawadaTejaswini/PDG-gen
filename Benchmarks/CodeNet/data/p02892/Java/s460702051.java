import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        int[][] dists = new int[n][n];
        for(int[] dd: dists) Arrays.fill(dd, Integer.MAX_VALUE/3);
        for(int i = 0; i < n; i++) {
            dists[i][i] = 0;
        }
        for(int i = 0; i < n; i++) {
            char[] line = scanner.next().toCharArray();
            for(int j = 0; j < n; j++) {
                if (line[j] == '1') {
                    dists[i][j] = 1;
                }
            }
        }
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    dists[i][j] = Math.min(dists[i][j], dists[i][k] + dists[k][j]);
                }
            }
        }
        Boolean[] col = new Boolean[n];
        col[0] = true;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(int edge = 0; edge < n; edge++) {
                if (dists[cur][edge] != 1) continue;
                if (col[edge] == null) {
                    col[edge] = !col[cur];
                    queue.offer(edge);
                }
                else if (col[edge] == col[cur]) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) if (dists[i][j] != Integer.MAX_VALUE/3) ans = Math.max(ans, dists[i][j] + 1);
        out.println(ans);
        out.flush();
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        public FastScanner() {
            this(new InputStreamReader(System.in));
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
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
