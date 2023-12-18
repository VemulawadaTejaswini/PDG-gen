import java.util.*;
import java.io.*;

public class Main {

    private final static int MOD = 998244353; // (int)1e9 + 7;
    private static final int INF = (int)1e9;

    public Main(FastScanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int a0 = (a * 25 + 1) / 2;
        int a1 = (a * 25 + 26) / 2 - 1;
        int b0 = b * 10;
        int b1 = b * 10 + 9;
        if (b1 < a0 || a1 < b0)
            out.println(-1);
        else if (a0 >= b0)
            out.println(a0);
        else if (b0 > a0)
            out.println(b0);
    }

    private int gcd(int a, int b) {
        while (true) {
            if (b == 0) return a;
            int tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long powm(long x, long p) {
        long res = 1;
        while (p > 0) {
            if (p % 2 == 1)
                res = res * x % MOD;
            x = x * x % MOD;
            p /= 2;
        }
        return res;
    }


    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);

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
