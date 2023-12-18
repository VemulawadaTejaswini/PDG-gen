import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

	 static class FastReader 
	    { 
	        final private int BUFFER_SIZE = 1 << 16; 
	        private DataInputStream din; 
	        private byte[] buffer; 
	        private int bufferPointer, bytesRead; 
	  
	        public FastReader() 
	        { 
	            din = new DataInputStream(System.in); 
	            buffer = new byte[BUFFER_SIZE]; 
	            bufferPointer = bytesRead = 0; 
	        } 
	  
	        public FastReader(String file_name) throws IOException 
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
	
		public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		public static long mod = (long) (1e9 + 7);
		public static int N = (int) 1e5;
		public static long[][] dp;
	    public static List<Integer>[] edges ;
		public static int[][] parent;
		public static int col = 20;
		public static int[] level;
		public static final int MAX = (int) 4e3+10;
		static FastReader sc = new FastReader();
		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   
			int n = sc.nextInt();
			int d = sc.nextInt();
			int a = sc.nextInt();
			TreeMap<Integer,Integer> map = new TreeMap<>();
			Pair[] mon = new Pair[n+1];
			mon[0] = new Pair(0,0);
			for(int i=1;i<=n;++i) {
				mon[i] = new Pair(sc.nextInt(),sc.nextInt());
			}
			
			Arrays.sort(mon,new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.x-o2.x;
				}
				
			});
	
			Fenwick bit = new Fenwick(n);
			long ans = 0;
			for(int i=1;i<=n;++i) {
				map.put(mon[i].x,i);
			}
			for(int i=1;i<=n;++i) {
				long curr = Math.max(0,mon[i].h-bit.point_query(i));
				long need = (curr+a-1)/a;
				long attack = need*a;
				int j = n;
				if(map.floorKey(mon[i].x+2*d)!=null)
				    j = map.get(map.floorKey(mon[i].x + 2*d));
				
				bit.update(i,j,attack);
				ans+=need;
				
			}
			out.print(ans);
			out.close();
			

		
		}
		
		static class Pair{
			int x;
			int h;
			Pair(int x,int h){
				this.x = x;
				this.h = h;
			}
		}
		
		static class Fenwick {
			// Range update and point query
	        int n;
	        long[] ft;
	 
	        public Fenwick(int n) {
	            this.n = n;
	            ft = new long[n + 2];
	        }
	 
	        void update(int l, int r, long val) {
	            point_update(l, val);
	            point_update(r + 1, -val);
	        }
	 
	        long point_query(int b) {
	            long sum = 0;
	            while (b > 0) {
	                sum += ft[b];
	                b -= b & -b;
	            }
	            return sum;
	        }
	 
	        void point_update(int k, long val) {
	            while (k <= n) {
	                ft[k] += val;
	                k += k & -k;
	            }
	        }
	    }
		
		
	}