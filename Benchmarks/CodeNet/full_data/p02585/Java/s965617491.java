
// Submitted By Subhash Yadav
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n=sc.nextInt(),k=sc.nextInt();
		int p[]=new int[n+1];
		for(int i=1;i<=n;i++) p[i]=sc.nextInt();
		int c[]=new int[n+1];
		for(int i=1;i<=n;i++) c[i]=sc.nextInt();
		
		long ans=Long.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			long res=0;
			int x=i;
			for(int j=0;j<k;j++) {
				long temp=c[p[x]];
				x=p[x];
				ans=Math.max(temp, ans);
				res+=temp;
				ans=Math.max(res, ans);
				
			}
			ans=Math.max(ans, res);
			
			
		}
		System.out.println(ans);
		
		
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

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}