import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int K = I.nextInt();
		int ans = 0;
		int[] cnts = new int[N+1]; //cnts[i] = number appearances of number i in array
		Arrays.fill(cnts, (int)(1e6));
		int totdiff = 0; //Number of different balls to start
		for (int i = 0; i < N; i++) {
			int x = I.nextInt();
			if (cnts[x]==(int)(1e6)) {
				 totdiff++;
				 cnts[x]=1;
			}else cnts[x]++;
		}
		Arrays.sort(cnts);
		int ptr = 0; //Pointer of counter array
		//O.pln(totdiff);
		while (totdiff>K) {
			ans+=cnts[ptr];
			ptr++;
			totdiff--;
		}
		O.pln(ans);
	}	
	public static void build(int[][] segtree,String S,int start, int end, int node) {
		if (start==end) {
			int[] cnts = new int[26];
			cnts[(int)(S.charAt(start))-97]++;
			for (int i = 0; i < 26; i++) segtree[node][i]=cnts[i];
		}else {
			int mid = (start+end)/2;
			build(segtree,S,start,mid,2*node); //Left child recursion
			build(segtree,S,mid+1,end,2*node+1);
			for (int i = 0; i < 26; i++) {
				segtree[node][i] = segtree[2*node][i]+segtree[2*node+1][i];
			}
		}
	}
	public static void UPD(int[][] segtree,String S,int start, int end, int in, 
	char val, int node) {
		if (start==end) {
			int prev = 0;
			for (int i = 0; i < 26; i++) { //Use the segment tree for referring to previous
				//data
				if (segtree[node][i]>0) {
					prev=i;
					break;
				}
			}
			segtree[node][prev]--;
			segtree[node][(int)(val)-97]++;
		}else {
			int mid = (start+end)/2;
			if (in>=start&&in<=mid) { //left child
				UPD(segtree,S,start,mid,in,val,2*node);
			}else if (in>mid&&in<=end){ //Right child
				UPD(segtree,S,mid+1,end,in,val,2*node+1);
			}
			for (int i = 0; i < 26; i++) {
				segtree[node][i]=segtree[node*2][i]+segtree[node*2+1][i];
			}
		}
	}
	public static int[] getAns(int[][] segtree,String S,int start,int end,
	int L, int R, int node) {
		int[] ret = new int[26];
		if (L>end||R<start) { //Out of range case
			return ret; //Return empty array (no affect on answer)
		}
		if (L<=start&&R>=end) { //Surrounded node case
			return segtree[node]; //Returning data stored in the surrounded node
		}
		int mid = (start+end)/2;
		int[] left = getAns(segtree,S,start,mid,L,R,2*node);
		int[] right = getAns(segtree,S,mid+1,end,L,R,2*node+1);
		for (int i = 0; i < 26; i++) ret[i] = left[i]+right[i]; //Parent data = children data sum
		return ret;
	}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
	public static int pop(long x) { //Returns number of bits within a number
		int cnt = 0;
		while (x>0) {
			if (x%2==1) cnt++;
			x/=2;
		}
		return cnt;
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void pln(BigInteger x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(BigInteger x) {w.print(x);w.flush();}
	}
}
