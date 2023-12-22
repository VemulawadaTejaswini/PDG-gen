


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
		int[] g=new int[n];
		FenwickTree ft= new FenwickTree(n+1);
		adjList=new ArrayList[n];
		for(int i=0;i<n;i++) {
			adjList[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n-1;i++) {
			int u =sc.nextInt()-1;
			int v=sc.nextInt()-1;
			int min=Math.min(u, v);
			int max=Math.max(u,v);
			adjList[u].add(v);
			adjList[v].add(u);
			g[min]++;
			s[max]++;
		}
//		for(int i=0;i<n;i++) {
////			ft.update_point(i+1, 1-s[i]);
//			ft.update_range(i+1,n, (1-s[i]));
//		}
//		for(int i=1;i<=n;i++)
//		System.err.println(ft.query(i)+" *");
//
//		System.err.println(ft.query( n));
//		long ans=0;
//		for(int i=0;i<n;i++) {
////			ft.update_range(i+1, n,1);
//			long sum=ft.query(n);
//			System.out.println(i+" "+sum);
//			ans+=sum;
//			ft.update_range(i+1, n,-ft.query(i+1));
//			for(int v:adjList[i]) {
//				if(v>i) {
//					ft.update_range(v+1, n, +1);
//				}
//			}
//
//
//		}
		/*
		 * 
 8
2 3
3 5
2 8
8 6
8 1
2 7
7 4

		 */
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
//				if(i==3) {
//					System.out.println(init+" * "+((n-i+1)*s[i-1]));
//				}
				init-=(n-i+1)*s[i-1];
			}
//			System.out.println(init);
			ans+=init;
			for(int v:adjList[i])
				if(v>i) {
//					if(i==3) {
//						System.out.println(init+" "+(n-v));
//					}

					init+=(n-v);
					s[v]++;
//					if(i==3) {
//						System.out.println(init);
//					}
				}
			
		}
		System.out.println(ans);
		
	
		pw.flush();
		pw.close();


	}

	static public class FenwickTree {//one-based DS
		//it's for reversable operations to be able to find a range but if u always want from 1 to j so it will work

		int[] ft;// note it must be 1 based because ur first elem FT[1] is A[1 -LSON(1)]  (i'm kidding it can also be 0 based ) 
		//to be consistent with segment tree let it to be 1 based
		int n;

		public FenwickTree(int n)  {
			this.n=n;
			ft= new int[n+1];
		}

		public int LSONE(int i) {
			return i&(-i);
		}

		public void update_point(int  k ,int val) {//O(log n) because K will at worst case incremented with the number of ones in n so if to get number of bit
			// it's log(n)
			while(k<=n) {
				ft[k]+=val;
				k+=LSONE(k);
			}
		}
	
	public void update_range(int i , int j ,int val) {
			update_point(i, val);
			update_point(j+1, -val);//the inverse of the operation in our case it's subtraction

		}
		public int query(int k) {// we keep adding ft[k]+ft[k']+ft[k"]+... where k' =k-LSONE(K) till k==0 it's also O(log(n))
			int sum =0;
			while(k>0) {
				sum+=ft[k];
				k-=LSONE(k);
			}
			return sum;
		}

		
public int query(int i , int j) {
			return query(j) - ((i<=1)?0:query(i-1));
		}

		public int pointQuery(int i) { //less than log n == no. of first zero bits till LSOne 
			int sum=ft[i];

			if(i>0) {
				//int z=(i)-(LSONE(i));	
				int z= i ^(i&-i); // turn off the LSONE
				i--;
				while(i!=z) {
					sum-=ft[i];
					i-=LSONE(i);
				}

			}
			return sum;
		}

		public void scale(int c) {
			for(int i=1;i<=n;i++) 
				ft[i]*=c;
		}
		int findIndex(int cumFreq)// log(n)(it's binary search)  use this only if u don't have negative freq i.e. it's sorted if not u have to use pointQuery for every point
		{
			int msk = n;
			while((msk & (msk - 1)) != 0) //this check that msk only consists of 00..0100..0 i.e. only one turned on bit
				msk ^= msk & -msk;			//msk will contain the MSB of n
			//it keeps turning off the least significant bit
			int idx = 0;
			while(msk != 0)
			{
				int tIdx = idx + msk;
				if(tIdx <= n && cumFreq >= ft[tIdx])
				{
					idx = tIdx;
					cumFreq -= ft[tIdx];
				}
				msk >>= 1;
			}
			if(cumFreq != 0)
				return -1;
			return idx;
		}


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