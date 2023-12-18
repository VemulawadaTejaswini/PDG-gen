import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int n = fs.nextInt(), m = fs.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        for(int i = 0; i < n; i++) {
            a[i][0] = fs.nextInt(); a[i][1] = fs.nextInt();
        }
        for(int i = 0; i < m; i++) {
            b[i][0] = fs.nextInt(); b[i][1] = fs.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int res = 0, best = (int)2e9+1000;
            for(int j = 0; j < m; j++) {
                int diff = Math.abs(a[i][0] - b[j][0]) + Math.abs(a[i][1] - b[j][1]);
                if(diff < best) {
                    best = diff;
                    res = j;
                }
            }
            out.println(res+1);
        }


        out.close();
    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String line = "";
            try {
                line = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return line;
        }

        public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public char[] nextCharArray() {
            return nextLine().toCharArray();
        }
    }
}
