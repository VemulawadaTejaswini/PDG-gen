import java.util.Collections;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	public static int max(int[][] ar, int ind1, int ind2){
		if(ind2 == 1){
			return Math.max(ar[ind1][2], ar[ind1][3]);
		}
		else if(ind2 == 2){
			return Math.max(ar[ind1][1], ar[ind1][3]);
		}
		else {
			return Math.max(ar[ind1][1], ar[ind1][2]);
		}
	}
	public static void main(String[] args) {
		Reader rd = new Reader();
		int n = rd.nextInt();
		int[][] ar = new int[n+1][4];
		int[][] dp = new int[n+1][4];
		for(int i=0; i<=n; i++){
			ar[i][0] = 0;
		}
		Arrays.fill(ar[0], 0);
		for(int i=1; i<=n; i++){
			for(int j=1; j<=3; j++){
				ar[i][j] = rd.nextInt();
			}
		}
		
		dp[1] = ar[1];
		int ii;
		//System.out.println(Arrays.toString(dp[1]));
		for(ii=2; ii<=n; ii++){
			/*
			for(int[] k : dp){
				System.out.println(Arrays.toString(k));
			}
			* */
			for(int jj=1; jj<=3; jj++){
				dp[ii][jj] = ar[ii][jj] + max(dp, ii-1, jj);
			}
		}
		/*
		for(int[] i : dp){
			System.out.println(Arrays.toString(i));
		}
		*/
		System.out.println(Math.max(Math.max(dp[ii-1][1], dp[ii-1][2]),dp[ii-1][3]));
	
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
