import java.util.*;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException,InterruptedException{
		Scanner sc=new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		char[] t=sc.next().toCharArray();
		int[][] dp=new int[s.length+1][t.length+1];
//		boolean[] freq=new boolean[s.length+1];
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s.length+1; i++) {
			for (int j = 0; j < t.length+1; j++) {
				if(i==0||j==0) dp[i][j]=0;
				else if(s[i-1]==t[j-1]) dp[i][j]=dp[i-1][j-1]+1;
				else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
//		pw.println(Arrays.deepToString(dp));
		int p1=s.length,p2=t.length;
		while(p1>0&&p2>0) {
			if (s[p1-1]==t[p2-1]) {
				sb.insert(0,s[p1-1]);
				p1--;
				p2--;
			}else if(dp[p1-1][p2]>dp[p1][p2-1]) {
				p1--;
			}else {
				p2--;
			}
		}
//		pw.println(Arrays.toString(freq));
		pw.println(sb);
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[i].length; j++) {
//				pw.print(dp[i][j]+" ");
//			}
//			pw.println();
//		}
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
		long x;
		long y;
 
		public pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public pair(long x, long y) {
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