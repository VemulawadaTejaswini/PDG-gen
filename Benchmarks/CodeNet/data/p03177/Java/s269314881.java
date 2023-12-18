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
 
    
    
    static int maxn = 1<<20;
    static long mod=(int)1e9+7 ;
    static int n,m;
    static long k;
    
    static int INF = (int)-1e9;
    static long[][] arr;
    
    void solve(PrintWriter out, Reader in) throws IOException{   
        n = in.nextInt();
        k = in.nextLong();
       
        arr = new long[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = in.nextLong();
    
        long[][] ans = bp(arr,k);
        
        long res =0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                res = (res+ans[i][j])%mod;
        out.println(res);
    }
    
    
    static long[][] mult(long[][] a,long[][] b){
        long[][] ret = new long[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int z=0;z<n;z++){
                    ret[i][j] = (ret[i][j]+a[i][z]*b[z][j])%mod;
                }
            }
        }
        
        return ret;
    }
    
    static long[][] bp(long[][] mat,long p){
        if(p==1){
            return mat;
        }
        
        long[][] tmp = bp(mat,p/2);
        tmp = mult(tmp,tmp);
        if(p%2==0) return tmp;
        else return mult(tmp,arr);
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