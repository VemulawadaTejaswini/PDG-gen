import java.util.*;
import java.io.*;

public class Main {

    public Main(FastScanner in, PrintWriter out, int test) {
        int N = in.nextInt();
        // find smallest prime fators of all numbers in [2:N]
        int[] spf = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            if (spf[i] > 0)
                continue;
            spf[i] = i;
            for (int j = i + i; j <= N; j += i) {
                if (spf[j] == 0)
                    spf[j] = i;
            }
        }

        long res = 1;
        for (int k = 2; k <= N; k++) {
            long fk = f(k, spf);
            res += k * fk;
        }
        out.println(res);
    }

    private int f(int x, int[] spf) {
        int cnt = 1, p = spf[x], cur = 0;
        while (x > 1) {
            if (spf[x] != p) {
                cnt *= 1 + cur;
                cur = 0;
                p = spf[x];
            }
            cur++;
            x /= p;
        }
        cnt *= 1 + cur;
        return cnt;
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