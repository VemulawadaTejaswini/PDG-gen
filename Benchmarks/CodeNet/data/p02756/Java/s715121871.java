import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { //X^0=X, therefore for null case, return 0
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		StringBuilder ans = new StringBuilder();
		StringBuilder beg = new StringBuilder(); //Beginning added letters to initial string
		StringBuilder end = new StringBuilder(); //End added letters to initial string
		String S = I.next();
		int Q = I.nextInt();
		String[] query = new String[Q];
		for (int i = 0; i < Q; i++) {
			int op = I.nextInt();
			if (op==1) query[i]=Integer.toString(op);
			else {
				String num = I.next();
				String ltr = I.next();
				query[i]=(Integer.toString(op)+num+ltr); //No spaces is better since each element
				//is unit long
			}
		}
		int[] expRev = new int[Q+1]; //Number of expected reversals after ith operation
		for (int i = Q-1; i >=0; i--) {
			expRev[i]=expRev[i+1];
			if (query[i].length()==1) expRev[i]++;
		}
		//for (int i = 0; i < Q; i++) O.pln(expRev[i]);
		for (int i = 0; i < Q; i++) {
			if (query[i].length()==3) {
				if (expRev[i]%2==0) { //If end=end and start=start (even reversal has no change)
					if (query[i].charAt(1)=='1') beg.insert(0,query[i].charAt(2)); 
					//Most recent deserves first slot
					else end.append(query[i].charAt(2));
				}else { //REVERSE case
					if (query[i].charAt(1)=='1') end.append(query[i].charAt(2));
					else beg.insert(0,query[i].charAt(2)); 
				}
			}
		}
		ans.append(beg);
		ans.append(S);
		ans.append(end);
		O.pln(ans);
	}
	public static void build(long[] segtree, long[] a, int start, int end, int node) {
		if (start==end) segtree[node] = a[start];
		else{ //Need else statements for void methods
			int mid = (start+end)/2;
			build(segtree,a,start,mid,2*node); //Build from left child onwards
			build(segtree,a,mid+1,end,2*node+1); //Build from right child onwards
			segtree[node] = segtree[2*node]^segtree[2*node+1]; //Current node stores XOR of children
			//(Order of XOR doesn't matter, just occurrences of 1 bit in a certain slot
		}
	}
	public static long getXOR(long[] segtree, long[] a, int start, int end, int L, int R, int node) {
		if (R<start||L>end) return 0; //Returning answer that has no effect on final answer
		if (L<=start&&R>=end) return segtree[node]; //If range encapsulates current node of 
		//segment tree
		int mid = (start+end)/2; //Partial case --> Recurse deeper into segment tree
		long left = getXOR(segtree,a,start,mid,L,R,node*2);
		long right = getXOR(segtree,a,mid+1,end,L,R,2*node+1);
		return left^right;
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
