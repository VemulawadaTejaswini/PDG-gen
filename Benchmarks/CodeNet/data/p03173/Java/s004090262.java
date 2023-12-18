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
    static int mod=(int)1e9+7;
    static int n,t,m,k,cnt;
    
    void solve(PrintWriter out, Reader in) throws IOException{   
        n = in.nextInt();
        long[] arr = new long[n+1];
        long sum[] = new long[n+1];
        for(int i=1;i<=n;i++) {
            arr[i]=in.nextLong();
            sum[i] = sum[i-1]+arr[i];
        }
        
        long dp[][] = new long[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i!=j)    dp[i][j] = 10000000000000000L;
            }
        }
        
        long min=Long.MAX_VALUE;
        for(int k=1;k<=n-1;k++){
            for(int i=1;i<=n-k;i++){
                min = Long.MAX_VALUE;
                if(k==1) min=0;
                
                for(int j=i;j<i+k;j++){
                    min = Math.min(min,dp[i][j]+dp[j+1][i+k]);
                }
                dp[i][i+k] = min+sum[i+k]-sum[i-1];
            }
        }
        
        out.println(dp[1][n]);
        
    }
    
    static class Edge implements Comparable<Edge> {
        int x,y;
        
        Edge(int x,int y){
            this.x = x;
            this.y = y;
        }
        
        
        public int compareTo(Edge o){
            return this.x- o.x;
        }
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