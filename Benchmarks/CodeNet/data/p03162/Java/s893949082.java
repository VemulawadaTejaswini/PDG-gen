import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static int n;
    static int a[],b[],c[];
    static int dp[][];
    static int solve(int i,int k)
    {
        if(i==n+1)
            return 0;
        if(dp[i][k]!=-1)
            return dp[i][k];
        dp[i][k]=0;
        if(k!=1)
            dp[i][k]=Math.max(dp[i][k],a[i]+solve(i+1,1));
        if(k!=2)
            dp[i][k]=Math.max(dp[i][k],b[i]+solve(i+1,2));
        if(k!=3)
            dp[i][k]=Math.max(dp[i][k],c[i]+solve(i+1,3));
        return dp[i][k];
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            n=in.ni();
            a=new int[n+1];
            b=new int[n+1];
            c=new int[n+1];
            dp=new int[n+1][4];
            for(int i=1;i<=n;i++)
            {
                a[i]=in.ni();
                b[i]=in.ni();
                c[i]=in.ni();
            }
            for(int i=0;i<=n;i++)
                Arrays.fill(dp[i],-1);
            out.println(solve(0,0));
            out.close();
        }
        catch(Exception e){
            return;
        }
    }
    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int ni() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nl() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

    }
}
