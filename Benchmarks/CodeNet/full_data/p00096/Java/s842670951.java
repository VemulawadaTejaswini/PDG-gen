import java.util.*;
import java.io.*;

public class Main {
	public void solve() throws IOException {
		long[][] dp = new long[5][4001];
		dp[0][0] = 1;
		for(int i = 1; i < 5; i++){
			for(int j = 0; j <= 4000; j++){
				if( dp[i-1][j] > 0 ){
					for(int k = 0; k <= 1000 && j+k <= 4000; k++){
						dp[i][j+k] += dp[i-1][j];
					}
				}
			}
		}
		while( stdIn.hasNext()  ){
			int n = stdIn.nextInt();
			writer.println(dp[4][n]);			
		}
		writer.flush();
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	Scanner stdIn;
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;

	public void run() throws IOException {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			stdIn = new Scanner(reader);
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			stdIn.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
}