
import java.io.*;
import java.util.*;



public class Main
{
	
	InputStream is;
	PrintWriter out;

	void solve()
	{
		
		int n = ni();
		int p = ni();
		int sum=n*3+p;
		System.out.println(sum/2);
	}
	
		
	
	 private long gcd(long a,long b)
	 {
	        while (a!=0 && b!=0)
	        {
	            if(a>b)
	                a%=b;
	            else
	                b%=a;
	        }
	        return a+b;
	    }
	    private long mp(long b, long e, long mod) {
	        b %= mod;
	        long r = 1;
	        while(e > 0) {
	            if((e & 1) == 1) {
	                r *= b; r %= mod;
	            }
	            b *= b; b %= mod;
	            e >>= 1;
	        }
	        return r;
	    }
	
	void run() throws Exception
	{
//		is = oj ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		is = System.in;
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
//		tr(System.currentTimeMillis()-s+"ms");
	}
	
	
	private static class BS {
        //  Binary search
        private static int binarySearch(int[] arr, int ele) {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == ele) {
                    return mid;
                } else if (ele < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }

        //    First occurence using binary search
        private static int binarySearchFirstOccurence(int[] arr, int ele) {
            int low = 0;
            int high = arr.length - 1;
            int ans = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == ele) {
                    ans = mid;
                    high = mid - 1;
                } else if (ele < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ans;
        }


        //    Last occurenece using binary search
        private static int binarySearchLastOccurence(int[] arr, int ele) 
        {
            int low = 0;
            int high = arr.length - 1;
            int ans = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == ele) {
                    ans = mid;
                    low = mid + 1;
                } else if (ele < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ans;
        }
        
        
        //just smaller or equal element using binary search
        static int binarySearchCountSmaller(int arr[], int key)  
        { 
        	int n  = arr.length;
            int left = 0, right = n; 
          
            int mid = 0; 
            while (left < right) { 
            mid = (right + left) >> 1; 
          
            if (arr[mid] == key) { 
                  
                while (mid+1<n && arr[mid + 1] == key) 
                mid++; 
                break; 
            } 
            else if (arr[mid] > key) 
                right = mid; 
          
            else
                left = mid + 1; 
            } 
            while (mid > - 1 && arr[mid] > key) 
            mid--; 
          
            return mid + 1; 
        } 
        
//        just greater or equal element using binary search
        static int ceilSearch(int arr[], int low, int high, int x) 
        { 
          int mid;     
    
          if(x <= arr[low]) 
            return low;  
           
     
          if(x > arr[high]) 
            return -1;   
  
          mid = (low + high)/2;  /* low + (high - low)/2 */
           
         
          if(arr[mid] == x) 
            return mid; 
               
         
          else if(arr[mid] < x) 
          { 
            if(mid + 1 <= high && x <= arr[mid+1]) 
              return mid + 1; 
            else
              return ceilSearch(arr, mid+1, high, x); 
          } 
           
            
          else
          { 
            if(mid - 1 >= low && x > arr[mid-1]) 
              return mid; 
            else    
              return ceilSearch(arr, low, mid - 1, x); 
          } 
        } 
        
        
    }
	public static void main(String[] args) throws Exception { new Main().run(); }
	
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	
	private int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
	private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private double nd() { return Double.parseDouble(ns()); }
	private char nc() { return (char)skip(); }
	
	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private long[] nla(int n)
	{
		long[] a = new long[n];
		for(int i = 0;i < n;i++)a[i] = nl();
		return a;
	}
	private int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private boolean oj = System.getProperty("ONLINE_JUDGE") != null;
	private void tr(Object... o) 
	{
		if(!oj)
		{
			System.out.println(Arrays.deepToString(o)); 
//			if(POUTPUT.equals(OUTPUT))
//			{
//				System.out.print("Verdict OK");
//			}
//			else
//			{
//				System.out.println("Wrong Answer");
//				System.out.println("Participant's Output : " + POUTPUT);
//				System.out.println("Jury's Answer : " + OUTPUT);
//			}
		}
	}

}

