


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;




public class Main {

	static ArrayList<Integer>[] adjList;

	static final double EPS=1e-5;
	static int mod=998244353;
	static long[] fac;
	static long INF=(long)1e13;

	
public static void main(String[] args) throws IOException, InterruptedException {

		Scanner	sc = new Scanner(System.in);
		PrintWriter pw= new PrintWriter(System.out);
		int n=sc.nextInt();
		int[] s= new int[n];
		adjList=new ArrayList[n];
		for(int i=0;i<n;i++) {
			adjList[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n-1;i++) {
			int u =sc.nextInt()-1;
			int v=sc.nextInt()-1;
			int max=Math.max(u,v);
			adjList[u].add(v);
			adjList[v].add(u);
			s[max]++;
		}
		for(int i=0;i<n;i++)
			{
			s[i]=1-s[i];
			}
		long ans=0;
		long init=0;
		long acc=0;
		for(int i=0;i<n;i++) {
			acc+=s[i];
			init+=acc;
		}
	
		for(int i=0;i<n;i++) {
			if(i!=0) {
				init-=(n-i+1)*s[i-1];
			}
			ans+=init;
			for(int v:adjList[i])
				if(v>i) {
					init+=(n-v);
					s[v]++;
				}
			
		}
		System.out.println(ans);
		
	
		pw.flush();
		pw.close();


	}

		static long powmod(long b,long e, int mod) {
		long ans=1;
		b%=mod;
		while(e>0) {
			if((e&1)==1)
				ans=(int)((ans*1l*b)%mod);
			e>>=1;
		b=(int)((b*1l*b)%mod);
		}
		return ans;
	}
	public static long add(long a, long b) {
		return (a+b)%mod;
	}
	public static long mul(long a, long b) {
		return ((a%mod)*(b%mod))%mod;
	}
	public static long ncr(int c, int r) {
		long ans= mul(fac[c],powmod(fac[c-r], mod-2, mod));
		ans=mul(ans,powmod(fac[r],mod-2,mod));
		return ans;
	}


	static class Pair implements Comparable<Pair>{
		int  x;int y;

		public Pair(int a,int b ) {
			this.x=a;y=b;
		}






		public int compareTo(Pair o) {
			return (x==o.x)?((y>o.y)?1:(y==o.y)?0:-1):((x>o.x)?1:-1);
		}


		@Override


		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String s) throws FileNotFoundException{	br = new BufferedReader(new FileReader(s));}

		public long[] nextLongArr(int n) throws IOException {
			long[] arr=new long[n];
			for(int i=0;i<n;i++)
				arr[i]=nextLong();
			return arr;
		}
		public int[] nextIntArr(int n) throws IOException {
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=nextInt();
			return arr;
		}
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine()," ,");
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}


		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++) {
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
				if (sb.length() == 18) {
					res += Long.parseLong(sb.toString()) / f;
					sb = new StringBuilder("0");
				}
			}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

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

}