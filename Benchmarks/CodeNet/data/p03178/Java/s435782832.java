import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static int n,k;
    static int m[];
    static long dp[][],dp1[][][];
    static long M=(int)1e9+7;
    static long solve(int i,int sum)
    {
        if(i==n)
        {
            if(sum==0)
                return 1;
            else
                return 0;
        }
        if(dp[i][sum]!=-1)
            return dp[i][sum]%M;
        dp[i][sum]=0;
        for(int ii=0;ii<=9;ii++)
        {
            dp[i][sum]=(dp[i][sum]%M+solve(i+1,(sum+ii)%k)%M)%M;
        }
        return dp[i][sum]%M;
    }
    static long solve1(int i,int sum,int kk)
    {
        if(i==n+1)
        {
            if(sum==0)
            {
                return 1;
            }
            else
                return 0;
        }
        if(dp1[i][sum][kk]!=-1)
            return dp1[i][sum][kk]%M;
        dp1[i][sum][kk]=0;
        if(kk==0)
        {
            for(int ii=0;ii<m[i];ii++)
            {
                if(i==1&&ii==0)
                    continue;
                dp1[i][sum][kk] = (dp1[i][sum][kk] % M + solve1(i + 1, (sum + ii) % k, 1) % M) % M;
            }
            dp1[i][sum][kk]=(dp1[i][sum][kk]%M+solve1(i+1,(sum+m[i])%k,0)%M)%M;
        }
        else
        {
            for (int ii = 0; ii <= 9; ii++)
                dp1[i][sum][kk] = (dp1[i][sum][kk] % M + solve1(i + 1, (sum + ii) % k, 1) % M) % M;
        }
        return dp1[i][sum][kk]%M;
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            String s=in.nextLine();
            n=s.length();
            k=in.ni();
            m=new int[n+1];
            dp=new long[n+1][k+1];
            dp1=new long[n+1][k+1][2];
            for(int i=1;i<=n;i++)
            {
                char c=s.charAt(i-1);
                int d=(int)c-(int)'0';
                m[i]=d;
            }
            for(int i=0;i<=n;i++)
                Arrays.fill(dp[i],-1);
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=k;j++)
                {
                    for(int jj=0;jj<=1;jj++)
                        dp1[i][j][jj]=-1;
                }
            }
            //out.println(solve1(1,0,0)-1);
            out.println((solve(1,0)%M+solve1(1,0,0)%M-1+M)%M);
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
