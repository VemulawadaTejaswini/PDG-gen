
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
	static int ans;
	public static ArrayList<Integer>[] adjArrayLists;
	static boolean visited[];
	public static void dfs(int src) {
		visited[src]=true;
		ans++;
		for(int u:adjArrayLists[src]) {
			if(!visited[u])
				dfs(u);
		}
		
	}

	public static void main(String[] args) throws IOException {

		FastScanner sc = new FastScanner();
		int n=sc.nextInt(),m=sc.nextInt();
		adjArrayLists=new ArrayList[n+1];
		for(int i=0;i<=n;i++) adjArrayLists[i]=new ArrayList<>();
				
		for(int i=0;i<m;i++) {
			int x=sc.nextInt(),y=sc.nextInt();
			adjArrayLists[x].add(y);
			adjArrayLists[y].add(x);
		}
		visited=new boolean[n+1];
		int res=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				ans=0;
				dfs(i);
				res=Math.max(res, ans);
			}
		}
		System.out.println(res);

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