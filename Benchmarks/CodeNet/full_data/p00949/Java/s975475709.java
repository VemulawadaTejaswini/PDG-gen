import java.util.*;
import java.io.*;
public class Main
{
	
	
	/************************ SOLUTION STARTS HERE ***********************/
	

	static final long p1 = (long) (1e9) + 9L;  		 // mod1
	static final long p2 = (long) (1e9) + 7L; 		// mod2
	static final long x1 = 46399; 				   // base1
	static final long x2 = 18757;				  // base2
	
	static long sub(long a, long b , long mod) {return ((a % mod) - (b % mod) + mod) % mod;}
	static long mul(long a, long b , long mod) {return ((a % mod) * (b % mod)) % mod;}
	static long add(long a, long b , long mod) {return ((a % mod) + (b % mod)) % mod;}
	static long modPow(long a, long b , long mod) { // squared exponentiation
		if (b == 0L || a == 1L)
			return 1L;
		else if (b == 1L)
			return a;
		else {
			if ((b & 1L) == 0L) // Checking whether b is even (fast)
				return modPow((a * a) % mod, b >> 1 , mod);
			else
				return (a * modPow((a * a) % mod, b >> 1 , mod)) % mod;
		}
	}

	
	private static void solve(FastScanner s1, PrintWriter out){
		
		char str1[] = s1.nextLine().toCharArray();
		char str2[] = s1.nextLine().toCharArray();
		
		int N = str1.length;
		int M = str2.length;
		
		int maxLen = 0;
		outer:
		for(int len = Math.min(N,M);len >= 1;len--) {
			
			long rollHash1 = 0;
			for(int i=0;i<len;i++)
				rollHash1 = add(rollHash1, modPow(x1, str1[i] - 'a', p1), p1);
			
			HashSet<Long> set = new HashSet<>();
			set.add(rollHash1);
			
			for(int i=len;i < N;i++) {
				rollHash1 = sub(rollHash1, modPow(x1, str1[i - len] - 'a', p1), p1);
				rollHash1 = add(rollHash1, modPow(x1, str1[i] - 'a', p1), p1);
				set.add(rollHash1);
			}
			
			long rollHash2 = 0;
			for(int i=0;i<len;i++)
				rollHash2 = add(rollHash2, modPow(x1, str2[i] - 'a', p1), p1);
			
			if(set.contains(rollHash2)) {
				// out.println(set);
				// out.println("hash " + rollHash2);
				maxLen = len;
				break;
			}
			
			for(int i=len;i<M;i++) {
				rollHash2 = sub(rollHash2, modPow(x1, str2[i - len] - 'a', p1), p1);
				rollHash2 = add(rollHash2, modPow(x1, str2[i] - 'a', p1), p1);
				if(set.contains(rollHash2)) {
					// out.println(set);
					// out.println("hash " + rollHash2);
					maxLen = len;
					break outer;
				}
			}
		}
		
		out.println(maxLen);
		
	}
	
	
	
	/************************ SOLUTION ENDS HERE ************************/
	
	
	
	
	
	/************************ TEMPLATE STARTS HERE *********************/
	
	public static void main(String []args) throws IOException {
		FastScanner in  = new FastScanner(System.in);
		PrintWriter out = 
				new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false); 
		solve(in, out);
		in.close();
		out.close();
	}    
	
	static class FastScanner{
		BufferedReader reader;
		StringTokenizer st;
		FastScanner(InputStream stream){reader=new BufferedReader(new InputStreamReader(stream));st=null;}	
		String next()
		{while(st == null || !st.hasMoreTokens()){try{String line = reader.readLine();if(line == null){return null;}		    
		st = new StringTokenizer(line);}catch (Exception e){throw new RuntimeException();}}return st.nextToken();}
		String nextLine()  {String s=null;try{s=reader.readLine();}catch(IOException e){e.printStackTrace();}return s;}	    	  	
		int    nextInt()   {return Integer.parseInt(next());}
		long   nextLong()  {return Long.parseLong(next());}		
		double nextDouble(){return Double.parseDouble(next());}
		char   nextChar()  {return next().charAt(0);}
		int[]  nextIntArray(int n)         {int[] a= new int[n];   int i=0;while(i<n){a[i++]=nextInt();}  return a;}
		long[] nextLongArray(int n)        {long[]a= new long[n];  int i=0;while(i<n){a[i++]=nextLong();} return a;}	
		int[]  nextIntArrayOneBased(int n) {int[] a= new int[n+1]; int i=1;while(i<=n){a[i++]=nextInt();} return a;}	    	
		long[] nextLongArrayOneBased(int n){long[]a= new long[n+1];int i=1;while(i<=n){a[i++]=nextLong();}return a;}	    	
		void   close(){try{reader.close();}catch(IOException e){e.printStackTrace();}}				
	}
	
	/************************ TEMPLATE ENDS HERE ************************/
}