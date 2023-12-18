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
    
    //<>;
    
    static int maxn = (int)1e5*2;
    static int mod=(int)1e9+7;
    static int n,t,m,k,cnt;
    
    static long[] tree;
    
    void solve(PrintWriter out, Reader in) throws IOException{   
        n = in.nextInt();
        
        tree = new long[n*4];
        int[] h = new int[n];
        for(int i=0;i<n;i++) h[i] = in.nextInt();
        
        int temp ;
        for(int i=0;i<n;i++){
            temp = in.nextInt();
            update(1,1,n,h[i],maxv(1,1,n,1,h[i]-1)+temp);
        }
        
        out.println(tree[1]);
    }
    
    
    static long maxv(int idx,int s,int e,int a,int b){
        if(a<=s && e<=b) return tree[idx];
        if(e<a || b<s) return 0L;
        
        int mid = (s+e)/2;
        return Math.max(maxv(idx*2,s,mid,a,b),maxv(idx*2+1,mid+1,e,a,b));
    }
    
    static void update(int idx,int s,int e,int a,long v){
        if(a<s || e<a) return;
        if(s==e) {
            tree[idx] = v;
            return;
        }
        
        int mid = (s+e)/2;
        update(idx*2,s,mid,a,v);
        update(idx*2+1,mid+1,e,a,v);
        
        tree[idx] = Math.max(tree[2*idx],tree[2*idx+1]);
    }
    
    static class Edge {
        int x,y;
        
        Edge(int x,int y){
            this.x = x;
            this.y = y;
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