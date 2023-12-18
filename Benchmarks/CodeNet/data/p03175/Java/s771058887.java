import java.io.*;
import java.util.*; 
import java.lang.*;

public class Main 
{   
    static LinkedList<Integer>[] adj;
    static int[][] dp;
    static int N;
    static int mod = 1000000007;
    
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }
    
    static int sum(int a, int b, int m) 
{ 
    // add two numbers 
    int s = a + b; 
  
    // do a mod with m 
    s = s % m; 
  
    return s; 
} 
    static int mult(int a, 
                            int b, int mod) 
    { 
          
        // Initialize result 
        int res = 0;   
  
        // Update a if it is more than  
        // or equal to mod  
        a %= mod; 
  
        while (b > 0)  
        { 
              
            // If b is odd, add a with result  
            if ((b & 1) > 0)  
            { 
                res = (res + a) % mod; 
            } 
  
            // Here we assume that doing 2*a  
            // doesn't cause overflow  
            a = (2 * a) % mod; 
  
            b >>= 1; // b = b / 2  
        } 
        return res; 
    }
    
    static int fn(int prev, int curr, int col) {
        if (dp[curr][col] != -1) { return dp[curr][col]; }
        if (col == 0) {
            int ans = 1;
            for (int i = 0; i < adj[curr].size(); i ++) {
                int next = adj[curr].get(i);
                if (next != curr && next != prev) {
                    ans = mult(ans, (fn(curr, next, 0) + fn(curr, next, 1)), mod);
                }
            }
            dp[curr][col] = ans;
        }
        else {
            int ans = 1;
            for (int i = 0; i < adj[curr].size(); i ++) {
                int next = adj[curr].get(i);
                if (next != curr && next != prev) {
                    ans = mult(ans, fn(curr, next, 0), mod);
                }
            }
            dp[curr][col] = ans;
        }
        return dp[curr][col];
    }
    
    public static void main(String[] args) throws IOException 
    {
        Reader scan = new Reader();
        N = scan.nextInt();
        adj = new LinkedList[N+1];
        for (int n = 0; n < N+1; n ++) {
            adj[n] = new LinkedList();
        }
        for (int n = 0; n < N-1; n ++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        dp = new int[N+1][2];
        for (int n = 0; n < N+1; n ++) {
            dp[n][0] = -1;
            dp[n][1] = -1;
        }
        System.out.println(sum(fn(0,1,0), fn(0,1,1), mod));
    }
}    