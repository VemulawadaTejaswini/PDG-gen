import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	public static int[] readInts(String cad) {
		String read[] = cad.split(" ");
		int res[] = new int[read.length];
		for (int i = 0; i < read.length; i++) {
			res[i] = Integer.parseInt(read[i]);
		}
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		StringBuilder out = new StringBuilder();
		BufferedReader in;
		
			in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int hi[] = readInts(in.readLine());
		int dp[] = new int[n];
		
		dp[0] = 0;
		dp[1] = Math.abs(hi[0] - hi[1]);
		for( int i = 2; i < n; i++ ) 
			dp[i] = Math.min(Math.abs(hi[i-1] - hi[i]) + dp[i-1], Math.abs(hi[i-2] - hi[i]) + dp[i-2]);
		
		System.out.print(dp[n-1]);

	}
	
}
