import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static int n,w;
    static int val[],wt[];
    static long dp[][];
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            n=in.ni();
            w=in.ni();
            val=new int[n+1];
            wt=new int[n+1];
            dp=new long[2][100005];
            for(int i=1;i<=n;i++)
            {
                wt[i]=in.ni();
                val[i]=in.ni();
            }
            for(int i=0;i<=1;i++)
                Arrays.fill(dp[i],-1);
            dp[0][0]=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=100000;j++)
                {
                    if(dp[i%2][j]==-1)
                        continue;
                    if(dp[(i+1)%2][j]==-1)
                        dp[(i+1)%2][j]=Long.MAX_VALUE;
                    if(dp[(i+1)%2][j+val[i+1]]==-1)
                        dp[(i+1)%2][j+val[i+1]]=Long.MAX_VALUE;
                    dp[(i+1)%2][j]=Math.min(dp[(i+1)%2][j],dp[i%2][j]);
                    dp[(i+1)%2][j+val[i+1]]=Math.min(dp[(i+1)%2][j+val[i+1]],wt[i+1]+dp[i%2][j]);
                }
            }
            int ans=0;
            for(int j=0;j<=100000;j++)
            {
                if(dp[n%2][j]==-1)
                    continue;
                if(dp[n%2][j]<=w)
                    ans=Math.max(ans,j);
            }
            out.println(ans);
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
