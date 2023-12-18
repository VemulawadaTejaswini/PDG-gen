import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        //essentially just interval scheduling
        int n = scanner.nextInt();
        int[][] ranges = new int[n][2];
        for(int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            ranges[i][0] = l - d;
            ranges[i][1] = l + d;
        }
        Arrays.sort(ranges, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int ans = 0;
        int prev = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if (ranges[i][0] >= prev) {
                ans++;
                prev = ranges[i][1];
            }
        }
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
