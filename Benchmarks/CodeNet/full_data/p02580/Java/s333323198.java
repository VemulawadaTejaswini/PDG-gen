import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastReader s=new FastReader();
        int h = s.nextInt();
        int w = s.nextInt();
        int m = s.nextInt();
        
        int[] xc = new int[h];
        int[] yc = new int[w];
        boolean[][] b = new boolean[h][w];

        for(int i=0; i<m; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            b[x-1][y-1] = true;
            xc[x-1]++;
            yc[y-1]++;
        }

        int max = 0;

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                max = Math.max(max, xc[i] + yc[j] - (b[i][j]?1:0));
            }
        }

        System.out.println(max);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (final IOException  e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (final IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}