import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static int n;
    static int m[][];
    static long dp[];
    static long M=(long)1e9+7;
    static long solve(int i,int mask)
    {
        if(i==n)
        {
            //System.out.println(mask);
            if(mask==((1<<n)-1))
                return 1;
            else
                return 0;
        }
        //System.out.println(i);
        if(dp[mask]!=-1)
            return dp[mask]%M;
        //dp[mask]=solve(i+1,mask);
        dp[mask]=0;
        for(int j=0;j<n;j++)
        {
            if(m[i][j]==0)
                continue;
            if((mask&(1<<j))==0)
            {
                dp[mask]=(dp[mask]%M+solve(i+1,(mask|(1<<j)))%M)%M;
            }
        }
        return dp[mask]%M;
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            n=in.ni();
            m=new int[n][n];
            dp=new long[1<<n];
            Arrays.fill(dp,-1);
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    m[i][j]=in.ni();
            }
            out.println(solve(0,0)%M);
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
