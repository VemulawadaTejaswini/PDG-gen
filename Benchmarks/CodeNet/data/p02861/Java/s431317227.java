import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n= scanner.nextInt();
        vals = new double[n][2];
        for(int i = 0; i < n; i++) {
            vals[i][0] = scanner.nextInt();
            vals[i][1] = scanner.nextInt();
        }
        order= new int[n];
        used = new boolean[n];
        for(int i = 2; i <= n; i++) {
            fact *= i;
        }
        bt(0);
        out.println(average);
        out.flush();
    }
    static int[] order;
    static boolean[] used;
    static double[][] vals;
    static double average = 0;
    static int fact = 1;
    static void bt(int ind) {
        if (ind == order.length) {
            double val = 0;
            for(int i = 0; i < ind -1; i++) {
                val += dist(order[i], order[i+1]);
            }
            average += val/fact;
        }
        for(int i = 0; i < order.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            order[ind] = i;
            bt(ind + 1);
            used[i] = false;
        }
    }
    static double dist(int a,int b) {
        double dx = vals[a][0] - vals[b][0];
        double dy = vals[a][1] - vals[b][1];
        return Math.sqrt(dx * dx + dy * dy);
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
