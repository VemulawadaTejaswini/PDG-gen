
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

		long N = Long.valueOf(inputArray[0]);
		long A = Long.valueOf(inputArray[1]);
		long []dp = new long[(int) N+1];
		for (int n = 1; n<=N; n++)
			dp[n] = n; 
		dp[1] = 1;
		for (int n = 1; n<=N; n++){
			int k=2;
			for (int d = n+n; d<=N; d+=n, k++){
				if (dp[d]>dp[n]+ A + k){
					for (int j=0; j<n; j++)
						dp[d-j]=dp[n]+ A + k;
				}
			}
		}
//		for (int n = 1; n<=N; n++)
//			sb.append(dp[n] + " ");
//		sb.append("\n");
			
		sb.append(dp[(int)N]);
		ln(sb);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.println(obj);
	}
}
