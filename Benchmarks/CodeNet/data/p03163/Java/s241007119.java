import java.util.Collections;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Reader rd = new Reader();
		int n = rd.nextInt();
		int w = rd.nextInt();
		int[][] list = new int[n+1][3];
		int flag = 0;
		for(int nn=1; nn<=n; nn++){
			list[nn][1] = rd.nextInt();
			list[nn][2] = rd.nextInt();
		}
		long[][] dp = new long[n+1][w+1];
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=w; j++){
				
				//System.out.println("list[i][1] : " + list[i][1] + " j : " + j);
				if(list[i][1] <= j){
					//System.out.println(dp[i-1][j]  + " " + dp[i-1][j-list[i][1]] + list[i][2]); 
 					dp[i][j] = Math.max(dp[i-1][j] , dp[i-1][j-list[i][1]] + list[i][2]);
				}
				else{
					//System.out.println("here");
					dp[i][j] = dp[i-1][j];
				}
				//System.out.println(Arrays.toString(dp[i]));
			}
		}
		/*
		for(long[] i : dp){
			System.out.println(Arrays.toString(i));
		}
		* */
		System.out.println(dp[n][w]);
	}

	static void sort(int[] ar){
		ArrayList<Integer> ls = new ArrayList<>();
		for(int i=0; i<ar.length; i++) ls.add(ar[i]);
		Collections.sort(ls);
		for(int i =0; i<ls.size(); i++) ar[i] = ls.get(i);
	}
}

class Reader { 
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer tok = new StringTokenizer("");
	static String next() {
		while(!tok.hasMoreTokens()){
			try{
				tok = new StringTokenizer(bf.readLine());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return tok.nextToken();
	} 
	static int nextInt() {
		return Integer.parseInt(next());
	}
}
