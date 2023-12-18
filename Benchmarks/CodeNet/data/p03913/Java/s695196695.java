
import static java.lang.System.in;
import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class Main {
	static final double EPS = 1e-10;
	static final long INF = 1L << 31;
	static final double PI = Math.PI;

	public static Scanner sc = new Scanner(in);
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void run() throws IOException {
		String input;
		String[] inputArray;
		input = br.readLine();
		inputArray = input.split(" ");

		int N = Integer.valueOf(inputArray[0]);
		int A = Integer.valueOf(inputArray[1]);
		int f = 10;
		int []dp = new int[f*N+1];
//		ArrayList<Integer> m = new ArrayList<Integer>();
		for (int n = 1; n<=f*N; n++)
			dp[n] = n; 
		for (int n = 1; n<=f*N; n++){
			int k=2;
//			dp[n] = Arrays.binarySearch(dp, n);
			for (int d = n+n; d<=f*N; d+=n, k++){
				if (dp[d]>dp[n]+ A + k){
					dp[d] = dp[n]+A+k; 
//					for (int j=0; j<n; j++)
//						dp[d-j]=dp[n]+ A + k;
				}
			}
		}
//		for (int n = 1; n<=N; n++)
//			sb.append(dp[n] + " ");
//		sb.append("\n");
		int ans = dp[N];
		for (int i=N; i<=f*N; i++)
			ans = Math.min(ans, dp[i]);
		sb.append(ans);
		ln(sb);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.println(obj);
	}
}
