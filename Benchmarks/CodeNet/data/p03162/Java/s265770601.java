import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	
	public static int[] readInts(String cad) {
		String read[] = cad.split(" ");
		int res[] = new int[read.length];
		for (int i = 0; i < read.length; i++) {
			res[i] = Integer.parseInt(read[i]);
		}
		return res;
	}
	
	static void printMatrixInt(int[][] array) {
		if (array == null || array.length == 0)
			return;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (j > 0)
					System.out.print(" ");
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) throws IOException {
		StringBuilder out = new StringBuilder();
		BufferedReader in;
		
			in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		
		int v[][] = new int[n][3];
		
		for( int i = 0; i< n; i++)
			v[i] = readInts(in.readLine());
		
		int dp[][] = new int[n][3];
		dp[0][0] = v[0][0];
		dp[0][1] = v[0][1];
		dp[0][2] = v[0][2];
		
		for( int i =1; i < n; i++ ) {
			dp[i][0] = v[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = v[i][1] + Math.max(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = v[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
		}
		
		
		System.out.print(Math.max(Math.max(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));

	}
	
}
