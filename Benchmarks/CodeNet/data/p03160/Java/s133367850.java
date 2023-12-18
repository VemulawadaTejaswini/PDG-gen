import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[]ar=new int[n],dp=new int[n];
		for(int i=0;i<n;i++)ar[i]=Integer.parseInt(st.nextToken());
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		for(int i=1;i<n;i++){
			dp[i]=Math.min(dp[i], dp[i-1]+Math.abs(ar[i]-ar[i-1]));
			if(i>1)dp[i]=Math.min(dp[i],  dp[i-2]+Math.abs(ar[i]-ar[i-2]));
		}
		System.out.println(dp[n-1]);
	}

}
