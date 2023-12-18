import java.io.*;
import java.math.*;
import java.util.*;
public class Main{ //USE LONGS TO AVOID OVERFLOW THEN CAST
 
	public static void main(String[] args) { 
		FastScanner input = new FastScanner();
		PrintWriter w = new PrintWriter(System.out);
		int N = input.nextInt();
		int Z = 0;
		TreeSet<Long> set = new TreeSet<Long>();
		long[] a = new long[N];
		long cnt = 0;
		String ans = "No";
		for (int i = 0; i < N; i++) {
			a[i] = input.nextLong();
			if (a[i]==0) Z++;
			set.add(a[i]);
		}
		if (Z==N) ans="Yes";
		else if (N%3==0) {
			if (Z==N/3) {
				if (set.size()==2) ans="Yes"; //0 and some other constant
			}else if (Z==0) {
				if (set.size()==3) {
					boolean good = true;
					Arrays.sort(a);
					for (int i = 0; i < N; i++) {
						cnt++;
						if ((i<N-1&&a[i]!=a[i+1])||i==N-1) {
							if (cnt!=N/3) {
								good=false;
								break;
							} 
							cnt=0;
						}
					}
					if (good) {
						long A = set.pollLast();
						long B = set.pollLast();
						long C = set.pollLast();
						if ((A^B)!=C) good=false;
					}
					if (good) ans="Yes";
				}
			}
		}
		
		w.println(ans);
		w.flush();
	}
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
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}