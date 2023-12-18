import java.util.*;
import java.io.*;
import java.lang.*;

public final class Main {

    private final static boolean USE_FILE_IO = false;

    Reader reader;
    Writer writer;

    Main(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    long o = 1_000_000_007;

    void solve() throws java.lang.Exception {
        long n = reader.nextLong();
        long m = reader.nextLong();
        long k = reader.nextLong();
        long ans = 0;
        long m2 = (m * m) % o;
        long n2 = (n * n) % o;
        for (int d=1; d<n; d++) {
            long dd = (d * (n-d)) % o;
            ans = (ans + dd * m2) % o;
        }
        for (int d=1; d<m; d++) {
            long dd = (d * (m-d)) % o;
            ans = (ans + dd * n2) % o;
        }
        ans = (ans * C(n*m-2, k-2)) % o;
        writer.writeLine(ans);
    }

    long C(long n, long k) {
        if (k>n) return 0;
        long ans = fact(n);
        ans = (ans * modinv(fact(n-k))) % o;
        ans = (ans * modinv(fact(k))) % o;
        return ans;
    }

    long fact(long n) {
        long ans = 1;
        for (int i=2; i<=n; i++) ans = (ans * i) % o;
        return ans;
    }

    long modinv(long x) {
        long m = o - 2;
        long ans = 1;
        while (m>0) {
            if ((m & 1) == 1) ans = (ans * x) % o;            
            x = (x * x) % o;
            m = m >> 1;
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Reader reader = null;
        Writer writer = null;
        try {
            if (USE_FILE_IO) {
                reader = new Reader(new FileInputStream("input.txt"));
                writer = new Writer(new FileOutputStream("output.txt"));
            } else {
                reader = new Reader(System.in);
                writer = new Writer(System.out);
            }
            new Main(reader, writer).solve();
        } finally {
            if (reader != null)
                reader.close();
            if (writer != null)
                writer.close();
        }
    }

    static class Writer {
        BufferedWriter bw;

        public Writer(OutputStream out) {
            bw = new BufferedWriter(new OutputStreamWriter(out));
        }

        void write(String s) throws java.lang.Exception {
            bw.write(s);
        }

        void write(int x) throws java.lang.Exception {
            write(String.valueOf(x));
        }

        void write(long x) throws java.lang.Exception {
            write(String.valueOf(x));
        }

        void write(char c) throws java.lang.Exception {
            bw.write(c);
        }

        void newLine() throws java.lang.Exception {
            bw.newLine();
        }

        void writeLine(String s) throws java.lang.Exception {
            write(s);
            newLine();
        }

        void writeLine(int n) throws java.lang.Exception {
            writeLine(String.valueOf(n));
        }

        void writeLine(long n) throws java.lang.Exception {
            writeLine(String.valueOf(n));
        }
        
        void writeLine() throws java.lang.Exception {
            writeLine("");
        }

        void close() throws java.lang.Exception {
            bw.flush();
            bw.close();
        }
    }

    static class Reader {
        BufferedReader br;
        StringTokenizer st;

        public Reader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String[] nextTokens(int n) {
            String[] a = new String[n];
            for (int i=0; i<n; i++) {
                a[i] = nextToken();
            }
            return a;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        int[] nextInts(int n) {
            int[] a = new int[n];
            for (int i=0; i<n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        long[] nextLongs(int n) {
            long[] a = new long[n];
            for (int i=0; i<n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
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

        void close() throws java.lang.Exception {
            br.close();
        }
    }
}