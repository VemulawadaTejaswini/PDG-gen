
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();
        int[] l = fs.nextArrInt(n);
        int ans = 0;
        Arrays.sort(l);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (l[i] != l[j] && l[j] != l[k] && l[i] + l[j] > l[k]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    
    static class FastScanner {
        StringTokenizer st;
        BufferedReader br;

        public FastScanner(InputStream system) {
            br  = new BufferedReader(new InputStreamReader(system));
        }

        public FastScanner(File file) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException { return br.readLine(); }
        public int nextInt() throws IOException { return Integer.parseInt(next()); }
        public long nextLong() throws IOException { return Long.parseLong(next()); }
        public double nextDouble() throws IOException { return Double.parseDouble(next()); }
        public char nextChar() throws IOException { return next().charAt(0); }
        public int[] nextArrInt(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
        public long[] nextArrLong(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
        public double[] nextArrDouble(int n) throws IOException {
            double[] a = new double[n];
            for (int i = 0; i < n; i++) a[i] = nextDouble();
            return a;
        }
        public boolean ready() throws IOException { return br.ready(); }
        public void waitForInput() throws InterruptedException  { Thread.sleep(3000); }
    }
}