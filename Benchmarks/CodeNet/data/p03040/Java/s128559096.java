// Working program using Reader Class 
import java.io.*;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 

public class Main 
{ 
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
			} while ((c = read()) >= '0' && c <= '9'); 

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
	
	public static long power(long l, long m,long p) 
    { 
		//long p=mod;
        // Initialize result 
        long res = 1;      
         
        // Update x if it is more   
        // than or equal to p 
        l = l % p;  
      
        while (m > 0) 
        { 
            // If y is odd, multiply x 
            // with result 
            if((m & 1)==1) 
                res = (res * l) % p; 
      
            // y must be even now 
            // y = y / 2 
            m = m >> 1;  
            l = (l * l) % p;  
        } 
        return (long)res; 
    } 
	
	public static long mod=998244353;
	
	public static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
	
	public static long modMult(long a,long b) {
		return ((a%mod)*(b%mod))%mod;
	}
	
	public static long modAdd(long a,long b) {
		return ((a%mod)+(b%mod))%mod;
	}
	
	public static ArrayList<Integer> median;
	
	public static void printMedian(int[] a) 
    { 
          
        double med = a[0]; 
          
        // max heap to store the smaller half elements  
        PriorityQueue<Integer> smaller = new PriorityQueue<> 
        (Collections.reverseOrder()); 
          
        // min heap to store the greater half elements  
        PriorityQueue<Integer> greater = new PriorityQueue<>(); 
          
        smaller.add(a[0]); 
        median.add((int)(med)); 
          
        // reading elements of stream one by one  
        /* At any time we try to make heaps balanced and  
            their sizes differ by at-most 1. If heaps are  
            balanced,then we declare median as average of  
            min_heap_right.top() and max_heap_left.top()  
            If heaps are unbalanced,then median is defined  
            as the top element of heap of larger size */
        for(int i = 1; i < a.length; i++) 
        { 
              
            int x = a[i]; 
              
            // case1(left side heap has more elements)  
            if(smaller.size() > greater.size()) 
            { 
                if(x < med) 
                { 
                    greater.add(smaller.remove()); 
                    smaller.add(x); 
                } 
                else
                    greater.add(x); 
                	median.add(smaller.peek()); 
            } 
              
            // case2(both heaps are balanced)  
            else if(smaller.size() == greater.size()) 
            { 
                if(x < med) 
                { 
                    smaller.add(x); 
                    median.add(smaller.peek()); 
                } 
                else
                { 
                    greater.add(x); 
                    median.add(greater.peek()); 
                } 
            } 
              
            // case3(right side heap has more elements)  
            else
            { 
                if(x > med) 
                { 
                    smaller.add(greater.remove()); 
                    greater.add(x); 
                } 
                else
                    smaller.add(x); 
                	median.add(smaller.peek()); 
                  
            } 
            //System.out.println(med); 
        } 
    }
	
	public static void main(String[] args) throws IOException 
	{ 
		Reader scan=new Reader();
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int q=scan.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Long> s=new ArrayList<Long>();
		int[] a=new int[q];
		long sum=0;
		for(int i=0;i<q;i++) {
			int x=scan.nextInt();
			a[i]=x;
			if(x==1) {
				int ai=scan.nextInt();
				int bi=scan.nextInt();
				al.add(ai);
				sum+=bi;
				s.add(sum);
			}
		}
		int[] arr=new int[al.size()];
		for(int i=0;i<al.size();i++) {
			arr[i]=al.get(i);
		}
		median=new ArrayList<Integer>();
		printMedian(arr);
		int j=0;
		for(int i=0;i<q;i++) {
			if(a[i]==1) {
				j++;
			}
			else {
				long ans=s.get(j-1);
				for(int k=0;k<j;k++) {
					ans+=(long)Math.abs(median.get(j-1)-al.get(k));
				}
				out.println(median.get(j-1)+" " +ans);
			}
		}
		out.close();
	} 
} 
