import java.util.*;
import java.io.*;
import java.lang.*;

public final class Main {

    private final static boolean USE_FILE_IO = false;
    private final static long M = 1000000007;

    Reader reader;
    Writer writer;

    Main(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    void solve() throws java.lang.Exception {
        int n = reader.nextInt();
        int m = reader.nextInt();
        LinkedList<Integer>[] g = new LinkedList[n];
        for (int i=0; i<n; i++) g[i] = new LinkedList<>();
        for (int i=0; i<m; i++) {
            int u = reader.nextInt() - 1;
            int v = reader.nextInt() - 1;
            int w = reader.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        boolean[] a = new boolean[n];
        int ans = 0;
        LinkedList<Integer> q = new LinkedList<Integer>();
        for (int i=0; i<n; i++) {
            if (!a[i]) {
                ans++;
                q.add(i);
                a[i] = true;
                while (!q.isEmpty()) {
                    int u = q.poll();
                    for (int v : g[u]) {
                        if (!a[v]) {
                            a[v] = true;
                            q.add(v);
                        }
                    }
                }
            }
        }
        writer.writeLine(ans);
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