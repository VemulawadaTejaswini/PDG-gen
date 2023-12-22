import java.io.*;

public class Main {

    private static final int M = 1_000_000_007;

    public Main(FastScanner in, PrintWriter out, int test) {
        long N = in.nextLong();
        Map<Integer, Integer> cnt = new HashMap<>();
        long n = N;
        int x2 = 0;
        while (n % 2 == 0) {
            x2++;
            n /= 2;
        }
        if (x2 > 0)
            cnt.put(2, x2);

        for (int d = 3; d <= N / d; d += 2) {
            int x = 0;
            while (n % d == 0) {
                x++;
                n /= d;
            }
            if (x > 0)
                cnt.put(d, x);
        }
        // N is a prime number
        if (cnt.isEmpty() && N > 1) {
            out.println(1);
            return;
        }

        int res = 0;
        for (var e : cnt.entrySet()) {
            int p = e.getKey(), x = e.getValue();
            int i = 1, a = 0;
            while (a + i <= x) {
                res++;
                a += i;
                i++;
            }
        }
        out.println(res);
    }

    private long pow(int x, int p) {
        long res = 1, a = x;
        while (p > 1) {
            if (p % 2 == 1)
                res = res * a % M;

            a = a * a % M;
            p /= 2;
        }
        res  = res * a % M;
        return res;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        // int T = in.nextInt();
        for (int t = 1; t <= 1; t++) {
            Main sol = new Main(in, out, t);
        }

        out.close();
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}
