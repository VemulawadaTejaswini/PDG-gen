import java.io.*;
import java.util.*;  
public class Main {	
	static int N,W;
	static int[] val,weight;
	static long[][] memo;
	public static long dp(int indx,int remWeight)
	{
		if(indx==N)return 0;
		if(memo[indx][remWeight]!=-1)return memo[indx][remWeight];
		return memo[indx][remWeight]=Math.max(remWeight-weight[indx]<0?Integer.MIN_VALUE:val[indx]+dp(indx +1,remWeight-weight[indx]), dp(indx+1, remWeight));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken()); W=Integer.parseInt(st.nextToken());
		val= new int[N]; weight= new int[N]; memo= new long[N][W+1];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i]=Integer.parseInt(st.nextToken());val[i]=Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < memo.length; i++) {
			for (int j = 0; j < memo[i].length; j++) {
				memo[i][j]=-1;
			}
		}
		pw.print(dp(0,W));
		pw.close();
	}
}