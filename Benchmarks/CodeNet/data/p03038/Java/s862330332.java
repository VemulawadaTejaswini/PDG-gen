import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //USE LONGS TO AVOID OVERFLOW THEN CAST
 
	public static void main(String[] args) { 
		FastScanner input = new FastScanner();
		PrintWriter w = new PrintWriter(System.out);
		int N = input.nextInt();
		int M = input.nextInt();
		long[] a = new long[N];
		long[][] u = new long[M][2];
		long ans = 0;
		int L = 0; //Pointer of original cards
		int R = M-1; //Pointer of big cards
		for (int i = 0; i < N; i++) {
			a[i]=input.nextLong();
			ans+=a[i];
		}
		for (int i = 0; i < M; i++) {
			u[i][0]=input.nextLong();
			u[i][1] = input.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(u,(z,b)->Long.compare(z[1], b[1])); //Sorting by maximum value
		while (L<N) {
			if (u[R][1]>a[L]) {
				ans+=u[R][1]-a[L];
				u[R][0]--;
				if (u[R][0]==0) R--;
				if (R<0) break;
				L++;
			}else break; //Everything is worse off from here then since array is sorted
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