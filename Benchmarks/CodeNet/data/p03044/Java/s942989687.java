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

    void solve() throws java.lang.Exception {
        int n = reader.nextInt();
        LinkedList<int[]>[] g = new LinkedList[n];
        for (int i=0; i<n; i++) g[i] = new LinkedList<>();
        for (int i=0; i<n-1; i++) {
            int u = reader.nextInt() - 1;
            int v = reader.nextInt() - 1;
            int w = reader.nextInt();
            g[u].add(new int[] { v, w & 1 });
            g[v].add(new int[] { u, w & 1 });
        }
        int[] col = new int[n];
        Arrays.fill(col, -1);
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(0);
        col[0] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int[] e : g[u]) {
                if (col[e[0]] == -1) {
                    col[e[0]] = e[1] == 0 ? col[u] : (1 - col[u]);
                    q.add(e[0]);
                }
            }
        }
        for (int i=0; i<n; i++) writer.writeLine(col[i]);
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