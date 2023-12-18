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
    static long mod;
    static int n,t,m,k;
 
    void solve(PrintWriter out, Reader in) throws IOException{   
        n = in.nextInt();
        m = in.nextInt();
        
        LinkedList<Integer> adj[] = new LinkedList[n+1];
        for(int i=1;i<=n;i++) adj[i] = new LinkedList<Integer>();
        
        int[] lvl = new int[n+1];
        
        int u,v;
        for(int i=0;i<m;i++){
            u = in.nextInt();
            v = in.nextInt();
            adj[u].add(v);
            lvl[v]++;
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> tosort = new LinkedList<Integer>();
        
        int[] dist = new int[n+1];
        for(int i=1;i<=n;i++) dist[i] = Integer.MIN_VALUE;
        
        for(int i=1;i<=n;i++){
            if(lvl[i]==0){
                q.add(i);
                dist[i] = 0;
            }
        }
        int element=0;    
        while(q.size()>0){
            element = q.poll();
            tosort.add(element);
            
            for(int e:adj[element]){
                lvl[e]--;
                if(lvl[e]==0) q.add(e);
            }
        }
        
        while(tosort.size()>0){
            element = tosort.poll();
            
            for(int e:adj[element])
                if(dist[e]<dist[element]+1)
                    dist[e] = dist[element]+1;
        }
        
        int ans=0;
        for(int i=1;i<=n;i++)  ans = Math.max(dist[i],ans);
        
        out.println(ans);
 
 
    }
    
    
    static class Edge implements Comparable<Edge> {
        int d,w;
        
        Edge(int d,int w){
            this.d = d;
            this.w = w;
        }
        
        
        public int compareTo(Edge o){
            return this.w - o.w;
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