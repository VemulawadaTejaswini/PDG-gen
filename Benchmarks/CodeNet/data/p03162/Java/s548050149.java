import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        //Scanner sc = new Scanner();
        Reader in = new Reader();
        Main solver = new Main();
        solver.solve(out, in);
        out.flush();
        out.close();

    }
    
    static int maxn = (int)1e5*2;
    static int mod = 998244353;
    static int t,n,m,k,arr[];
    
    void solve(PrintWriter out, Reader in) throws IOException{   
        n = in.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = in.nextInt();
        }
        
        int[][] dp = new int[n][3];
         
        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];
        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2])+a[i];
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2])+b[i];
            dp[i][2] = Math.max(dp[i-1][1],dp[i-1][0])+c[i];
        }
        
        out.println(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
        
    }
    
    
    
  
 
    
    
    static class Reader {
 
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
     
        public Reader() {
            this(System.in);
        }
     
        public Reader(InputStream is) {
            mIs = is;
        }
     
        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
        
        }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
     
        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
     
        public String next() {
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
     
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
     
        public long nextLong() {
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
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
     
        public int nextInt() {
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
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
     
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
     
        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
 
    }
}