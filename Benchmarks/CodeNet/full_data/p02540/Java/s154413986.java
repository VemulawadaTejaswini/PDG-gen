
import java.io.*;
import java.util.*;

public class Main {
	
	public static FastReader scan = new FastReader();

	public static void main(String[] args) {
		
//		int t = scan.nextInt();
//		
//		while(t--> 0) {
//			int n = scan.nextInt();
//			ArrayList<Integer> pos = new ArrayList<>();
//			ArrayList<Integer> neg = new ArrayList<>();
//			
//			int o = 0, m = 0;
//			
//			for(int i=0; i<n; i++) {
//				int a = scan.nextInt();
//				if(a < 0) neg.add(a);
//				else pos.add(a);
//			}
//			
//			Collections.sort(neg, Collections.reverseOrder());
//			Collections.sort(pos);
//			
//			
//			
//		}
		
		int n = scan.nextInt();
		int a[][] = new int[n][2];
		int c[] =  new int[n];
		
		for(int i=0; i<n; i++) {
			a[i][0] = scan.nextInt();
			a[i][1] = scan.nextInt();
		}
		
		int ij = 2;
		while(ij--> 0)
			for(int i=0; i<n; i++) {
				int cnt = 1;
				for(int j=0; j<n; j++) {
					if(a[i][0] < a[j][0] && a[i][1] < a[j][1]) {
						cnt++;
						if(c[j] != 0 && c[j] > cnt) {
							cnt = c[j];
							break;
						}
					}
					if(a[i][0] > a[j][0] && a[i][1] > a[j][1]) {
						cnt++;
						if(c[j] != 0 && c[j] > cnt) {
							cnt = c[j];
							break;
						}
					}
				}
				
				if(ij == 1) System.out.println(cnt);
				c[i] = cnt;
			}
		
  }

	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
	
	public static long abs(long a, long b) {return Math.abs(a - b);}
	public static long min(long a, long b) {return Math.min(a, b);}
	public static long max(long a, long b) {return Math.max(a, b);}
	
	// sieveOfEratosthenes 
	public static boolean[] sieve(int n) {
		boolean[] prime = new boolean[n+1];
		
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i=2; i*i<n; i++) {
			if(prime[i] == true) {				
				for(int j=i*2; j<=n; j+=i) {
					prime[j] = false;
				}
			}
		}
		
		return prime;
	}
	
	//smallestFactor function
	public static int smallestFactor(int n) {
		int i;
		for(i=2; i*i<=n; i++) {
			if(n%i == 0) 
				break;
		}
		return i;
	}
	
	//isPrime 
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int i=2; i*i<=n; i++) if(n % i == 0) isPrime = false;
		return isPrime;
	}

	//FastReader Class
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 
		
		char[] nextChar() 
		{
			return next().toCharArray();
		}

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	}  
}
