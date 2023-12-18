import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Edge, Integer> map = new HashMap<>();
		ArrayList<Edge>[] adj= new ArrayList[n];
		for(int i=0;i<n;i++) {
			adj[i] = new ArrayList<>();
		}
		int dp[] = new int[2*m];
		Set<Integer> check = new HashSet<>();
		HashMap<Edge, Integer> get = new HashMap<>();
		for(int i=0;i<m;i++) {
			int p = sc.nextInt()-1;
			int q = sc.nextInt()-1;
			
			int c = sc.nextInt()-1;
			if(p==n-1 || q==n-1) {
				check.add(c);
			}
			Edge x = new Edge(q,c);
			Edge y = new Edge(p,c);
			adj[p].add(x);
			adj[q].add(y);
			get.put(x,2*i);
			get.put(y,2*i+1);
			dp[2*i] = 1000000000;
			dp[2*i+1] = 1000000000;
			
		}
		LinkedList<Edge> pq = new LinkedList<>();
			
		for(Edge x : adj[0]) {
			dp[get.get(x)]= 1;
			pq.add(x);
		}
		while(!pq.isEmpty()) {
			Edge curr = pq.poll();
			int currEdge = get.get(curr);
			int steps = dp[currEdge];
			for(Edge next : adj[curr.dest]) {
				if(next.c==curr.c) {
					if(steps<dp[get.get(next)]) {
						dp[get.get(next)] = steps;
						pq.addFirst(next);
					}
				}
				else {
					if(steps+1<dp[get.get(next)]) {
						dp[get.get(next)] = steps+1;
						pq.addLast(next);
					}
				}
			}
		}
		int min = 1000000000;
		for(int c : check) {
			min = Math.min(min,dp[get.get(new Edge(n-1,c))]);
		}
		if(min>=1000000000) {
			System.out.println(-1);
		}
		else {
			System.out.println(min);
		}
		
	}
	static class Edge{
		int dest;
		int c;
		public Edge(int dest,int c) {
			this.dest = dest;
			this.c = c;
		}
		@Override
		public int hashCode() {
			return dest*1299827+c*1299821;
		}
		@Override
		public boolean equals(Object o) {
			Edge e = (Edge)o;
			return (e.dest==dest && e.c==c);
		}
		
	}
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
}


