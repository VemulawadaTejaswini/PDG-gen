import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        new Main().go();
    }

    PrintWriter out;
    Reader in;
    BufferedReader br;

    Main() throws IOException {

        try {

            //br = new BufferedReader( new FileReader("input.txt") );
            //in = new Reader("input.txt");
            in = new Reader("input.txt");
            out = new PrintWriter( new BufferedWriter(new FileWriter("output.txt")) );
        }
        catch (Exception e) {

            //br = new BufferedReader( new InputStreamReader( System.in ) );
            in = new Reader();
            out = new PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)) );
        }
    }

    void go() throws Exception {

        //int t = in.nextInt();
        int t = 1;
        while (t > 0) {
            solve();
            t--;
        }

        out.flush();
        out.close();
    }


    int inf = 2000000000;
    int mod = 1000000007;
    double eps = 0.000000001;

    int n;
    int m;

    ArrayList<Integer>[] g;
    int[] a;
    void solve() throws IOException {
        int n = in.nextInt();
        long[] st = new long[n + 1];
        long cur = 1;
        for (int i = 0; i <= n; i++) {
            st[i] = (cur - 1 + mod) % mod;
            cur = (cur * 2) % mod;
        }
        HashMap<Long, Integer> first = new HashMap<>();
        HashMap<Long, Integer> second = new HashMap<>();
        int same = 0;
        int sameNeg = 0;
        int zeros = 0;
        for (int i = 0; i < n; i++) {
            long a = in.nextLong();
            long b = in.nextLong();

            if (a == 0 && b == 0) {
                zeros++;
                continue;
            }

            if (a == 0) {
                first.put(0L, first.getOrDefault(0L, 0) + 1);
                continue;
            }

            if (b == 0) {
                second.put(0L, second.getOrDefault(0L, 0) + 1);
                continue;
            }

            if (Math.abs(a) > Math.abs(b)) {
                long d = a / b;
                first.put(d, first.getOrDefault(d, 0) + 1);
            } else if (Math.abs(a) < Math.abs(b)) {
                long d = b / a;
                second.put(d, second.getOrDefault(d, 0) + 1);
            } else {
                long d = a / b;
                if (d > 0) {
                    same++;
                }
                else {
                    sameNeg++;
                }
            }
        }


        ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();
        for (long k : first.keySet()) {
            int x = second.getOrDefault(-k, 0);
            list.add(new Pair(first.get(k), x));
            second.remove(-k);
        }

        for (long k : second.keySet()) {
            list.add(new Pair(0, second.get(k)));
        }

        long ans = (st[same] + st[sameNeg]) % mod;
        for (Pair<Integer, Integer> p : list) {
            int x = p.a;
            int y = p.b;
            long s1 = (ans * st[x]) % mod;
            long s2 = (ans * st[y]) % mod;
            ans = (ans + st[x]) % mod;
            ans = (ans + st[y]) % mod;
            ans = (ans + s1) % mod;
            ans = (ans + s2) % mod;
        }
        ans = (zeros + ans) % mod;

        out.println(ans);
    }

    static class Pair<A extends Comparable<A>, B extends Comparable<B>> implements Comparable<Pair<A, B>> {

        public final A a;
        public final B b;

        Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Pair<A, B> p) {
            if (!a.equals(p.a))
                return a.compareTo(p.a);
            else
                return b.compareTo(p.b);
        }
    }

    class Item {

        int a;
        int b;
        int c;

        Item(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }


    class Reader {

        BufferedReader  br;
        StringTokenizer tok;

        Reader(String file) throws IOException {
            br = new BufferedReader( new FileReader(file) );
        }

        Reader() throws IOException {
            br = new BufferedReader( new InputStreamReader(System.in) );
        }

        String next() throws IOException {

            while (tok == null || !tok.hasMoreElements())
                tok = new StringTokenizer(br.readLine());
            return tok.nextToken();
        }

        int nextInt() throws NumberFormatException, IOException {
            return Integer.valueOf(next());
        }

        long nextLong() throws NumberFormatException, IOException {
            return Long.valueOf(next());
        }

        double nextDouble() throws NumberFormatException, IOException {
            return Double.valueOf(next());
        }


        String nextLine() throws IOException {
            return br.readLine();
        }

    }

    static class InputReader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public InputReader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public InputReader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

}