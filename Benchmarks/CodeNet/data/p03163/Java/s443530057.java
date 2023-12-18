import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long [][] memo ;
	static int [] w ;
	static int [] v;
	public static long dp(int i,int max) {
		if(i==memo.length)return 0;
		if (w[i]>max) { 
		return 	memo[i][max]=dp(i+1, max);
		}
		long take = dp(i+1, max-w[i])+ v[i];
		long leave = dp(i+1, max);
		 return memo[i][max]= Math.max(take, leave);
	}

	public static void main(String[] args) throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			memo = new long [n][W+1];
			 w = new int [n];
			 v= new int [n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				w[i] = Integer.parseInt(st.nextToken());
				v[i]= Integer.parseInt(st.nextToken());
			}
			System.out.println(dp(0, W));

	}

}
