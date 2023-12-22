//package AtCoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
	static int INF = (int) 1e9;
	static ArrayList<Integer>[] adjList;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int res = 0 ;
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++)
			System.out.println(check(i, n));
	}

	public static int check(int n , int N) {
		int max= (int)Math.sqrt(N);
		int res = 0;
		for( int x = 1 ; x <= 100 ; x++)
			for( int y = 1 ; y <= 100 ; y++)
				if(find(1,max, x, y, n)) res++;
		return res;
	}
	
	public static boolean find(int lo , int hi , int x,int y, int n) {
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
			int curr = x*x + y*y + mid * mid + x*y + y*mid + x*mid;
			if( curr == n)
				return true ;
			else if( curr > n) hi = mid-1;
			else 
				lo = mid +1 ;
		}
		return false;
	}
	
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;

		return gcd(b % a, a);
	}

	public static void shuffle(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			int tmp = a[i];
			a[i] = a[r];
			a[r] = tmp;
		}
	}

	public static long square(long l) {
		return l * l;
	}
}
