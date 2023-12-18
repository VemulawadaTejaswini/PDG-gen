import java.util.*;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException,InterruptedException{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int[] weight=new int[n];
		int[] value=new int[n];
		long[][] dp=new long[n+1][w+1];
		for (int i = 0; i < n; i++) {
			weight[i]=sc.nextInt();
			value[i]=sc.nextInt();
		}
		for (int i = 0; i < n+1; i++) {
			for (int j = 0; j < w+1; j++) {
				if(i==0||j==0) dp[i][j]=0;
				else if(weight[i-1]<=j) {
					dp[i][j]=Math.max(value[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
//		for (int i = 0; i < n+1; i++) {
//			for (int j = 0; j < w+1; j++) {
//				pw.print(dp[i][j]+" ");
//			}
//			pw.println();
//		}
		pw.println(dp[n][w]);
		pw.close();
    }
	
	static PrintWriter pw=new PrintWriter(System.out);
	static long pow(int a,int b) {
		long r=1l;
		for (int i = 0; i < b; i++) {
			r*=a;
		}
		return r;
	}
	static int[]lp;
	static void sieveLinear(int N){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		lp = new int[N + 1];								//lp[i] = least prime divisor of i
		for(int i = 2; i <= N; ++i){
			if(lp[i] == 0){
				primes.add(i);
				lp[i] = i;
			}
			int curLP = lp[i];
			for(int p: primes)//all primes smaller than or equal my lowest prime divisor
				if(p > curLP || p * 1l * i > N)
					break;
				else
					lp[p * i] = p;
		}
	}
	static long gcd(int x,int y) {
		while (x!=y) {
			if(Math.max(x,y)/Math.min(x,y)==(double)(Math.max(x,y))/Math.min(x,y)) return Math.min(x,y);
			if(lp.length!=0) {
				if(lp[x]==x) {
					if(y/x==y/(double)x) return x;
					else return 1;
				}else if (lp[y]==y) {
					if(x/y==x/(double)y) return y;
					else return 1;
				}	
			}
			if(x>y) x-=y;
			else y-=x;
		}
		return x;
	}
	static class pair implements Comparable<pair> {
		int x;
		int y;
 
		public pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
 
		public String toString() {
			return x + " " + y;
		}
		public boolean equals(Object o) {
            if (o instanceof pair) {
                pair p = (pair)o;
                return p.x == x && p.y == y;
            }
            return false;
        }
        public int hashCode() {
            return new Double(x).hashCode() * 31 + new Double(y).hashCode();
        }
        public int compareTo(pair other) {
        	if(this.x==other.x) {
        		return Long.compare(this.y, other.y);
        	}
			return Long.compare(this.x, other.x);
		}
	}
	static class tuble implements Comparable<tuble> {
		int x;
		int y;
		int z;
 
		public tuble(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
 
		public String toString() {
			return x + " " + y + " " + z;
		}
 
		public int compareTo(tuble other) {
			if (this.x == other.x) {
				if(this.y==other.y) return this.z - other.z;
				else return this.y - other.y;
			} else {
				return this.x - other.x;
			}
		}
	}
 	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
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
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
	}
 
}