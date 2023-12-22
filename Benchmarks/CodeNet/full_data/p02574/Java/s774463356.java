import java.util.*;
import java.io.*;
public class Main {
	static int gcd(int a, int b) {
		if(a==0)
			return b;
		return gcd(b%a, a);
	}
	static HashSet<Integer> primeFactors(int val){
		HashSet<Integer> hset=new HashSet<>();
		for(int i=2;i<=Math.sqrt(val);i++) {
			while(val%i==0) {
				val=val/i;
				hset.add(i);
			}
		}
		if(val>2) {
			hset.add(val);
		}
		return hset;
	}
	public static void main(String args[]) {
		FastScanner in = new FastScanner();
		int n=in.nextInt();
		int a[]=in.readArray(n);
		HashSet<Integer> set=new HashSet<>();
		boolean chk=true;
		L: for(int i=0;i<n;i++) {
			HashSet<Integer> hset=new HashSet<>(primeFactors(a[i]));
			for(int val: hset) {
				if(set.contains(val)) {
					chk=false;
					break L;
				}
				set.add(val);
			}
		}
		if(!chk) {
			int result=a[0];
			for(int i=0;i<n;i++) {
				result=gcd(result, a[i]);
			}
			if(result==1) {
				System.out.println("setwise coprime");
			}
			else {
				System.out.println("not coprime");
			}
		}
		else {
			System.out.println("pairwise coprime");
		}
	}

	///////////////////////////
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
