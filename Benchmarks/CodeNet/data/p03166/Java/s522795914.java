import java.util.*;
import java.io.*;

class Main {

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

    static final Reader in = new Reader();
    static final PrintWriter out = new PrintWriter(System.out);
    static int N, M;
    static List<Integer>[] adj;
    static int[] dist;
    static boolean[] visited;

    static int dfs(int x){
        // System.out.println("x = "+x);
        if(dist[x] != 0)
            return dist[x];
            
        visited[x] = true;

        for(int y : adj[x]){

            dist[x] = Math.max(dist[x],1+dfs(y));
        }
        return dist[x];
    }

    public static void main(String[] args) throws Exception{
        N = in.nextInt();
        M = in.nextInt();
        adj = new ArrayList[N];
        dist = new int[N];
        visited = new boolean[N];

        for(int i = 0;i < N;i++)    
            adj[i] = new ArrayList<>();
        
        for(int i = 0;i < M;i++){
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            adj[x].add(y);
        }    
        
        for(int i = 0;i < N;i++)
            if(!visited[i])
                dfs(i);

        // for(int i = 0;i < N;i++)
        //     System.out.print(dist[i]+" ");
        // System.out.println();            
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i < N;i++){
            ans = Math.max(dist[i],ans);
        }

        out.println(ans);

        out.close();

    }

}
