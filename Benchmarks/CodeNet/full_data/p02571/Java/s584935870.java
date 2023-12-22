
// Submitted by Subhash
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String s=sc.next(),t=sc.next();
		char c1[]=s.toCharArray();
		
		char c2[]=t.toCharArray();
		int n=c1.length,m=c2.length;
		int max=0;
		
		for(int i=0;i<m;i++) {
			for(int j=i;j<n&&n-j>=m-i;j++) {
				
				if(c2[i]==c1[j]) {
					
					int c=0;
					int k=0;
					
					for(int i1=j-i;i1<j-i+m;i1++) {
						if(c2[k++]==c1[i1]) c++;
					}
					
					max=Math.max(max, c);
				}
				
			}
		}
		
		System.out.println(m-max);
		
		
	}

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

		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}