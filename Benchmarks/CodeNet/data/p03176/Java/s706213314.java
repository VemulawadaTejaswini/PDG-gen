
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		int[] h = input2(n);
		long[] a = input(n);
		int sqrt = (int)Math.sqrt(n);
		int size = n/sqrt +1; 
		long[] block = new long[size];
		long[] dp = new long[n+1];
	
		
		for(int i = 0 ;i < n;i++) {
			int height = h[i]-1;
			
			long max = 0;
			
			while( height>=0 && height%sqrt!=sqrt-1) {
				max = Math.max(max, dp[height]);
				height--;
			}
			height /= sqrt;
			while(height>=0) {
				max = Math.max(max, block[height]);
				height--;
			}
			
			
			long ans = max + a[i];
			
			dp[h[i]] = ans;
			int bl_ind = h[i]/sqrt;
			block[bl_ind] =Math.max(block[bl_ind] , ans);
		}
		
		
		
		long ans = 0 ;
		for(int i = 1 ;i <=n;i++ ) {
			ans  = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}

	static long mod = 1000000007;
	static TreeMap<Integer, ArrayList<Integer>> map;

	

	public static long[] input(int n) throws Exception {

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		return arr;
	}

	public static int[] input2(int n) throws Exception {

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int[][] input(int n, int m) throws Exception {

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
