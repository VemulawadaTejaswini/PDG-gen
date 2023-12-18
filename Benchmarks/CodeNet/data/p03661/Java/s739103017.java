import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;


public class Main {
    String filename = "cubes";//filename here, System.in/out if no file

    FastScanner in;
    PrintWriter out;


    void solve() {
        int n = in.nextInt();
        long[] m = new long[n];
        long[] p = new long[n];
        long[] s = new long[n];
        for (int i = 0; i < n; i++) m[i] = in.nextInt();
        p[0] = m[0];
        for (int i = 1; i < n; i++) p[i] = p[i - 1] + m[i];
        s[n - 1] = m[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            s[i] = m[i] + s[i + 1];
        }
        long ans = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            ans=Math.min(ans,Math.abs(p[i-1]-s[i]));
        }
        out.println(ans);
    }

    void run() throws IOException {
        InputStream input = System.in;
        OutputStream output = System.out;
        try {
            File f = new File(filename + ".in");
            if (f.exists() && f.canRead()) {
                input = new FileInputStream(f);
                output = new FileOutputStream(filename + ".out");
            }
        } catch (IOException e) {
        }
        in = new FastScanner(input);
        out = new PrintWriter(new BufferedOutputStream(output));
        solve();
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    class FastScanner implements Closeable {
        private BufferedReader br;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream stream) throws FileNotFoundException {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    String s = br.readLine();
                    if (s == null) {
                        return false;
                    }
                    tokenizer = new StringTokenizer(s);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.hasMoreTokens();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
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

        @Override
        public void close() throws IOException {
            br.close();
        }
    }
}