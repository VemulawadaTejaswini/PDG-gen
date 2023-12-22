import java.util.*;
import java.io.*;

public class Main {
	public void solve() throws IOException {
		int n = nextInt();
		int[][] mat = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				mat[i][j] = nextInt();
			}
		}
		int[][][] sum = new int[n][n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				sum[i][j][j] = mat[i][j];
				for(int k = j+1; k < n; k++){
					sum[i][j][k] = sum[i][j][k-1] + mat[i][k];
				}
			}
		}
	/*	for(int[][] x : sum){
			for(int[] y : x){
				for(int z : y){
					writer.print(z + " ");
				}
				writer.println();
			}
			writer.println();
		}*/
		long ans = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = j; k < n; k++){
					long tmp = 0;
					for(int l = i; l < n; l++){
						tmp += sum[l][j][k];
						ans = Math.max(ans, tmp);
		//				writer.println("sum[" + l + "][" + j + "][" + k + "] = " + sum[l][j][k]);
		//				writer.println(i + ", " + j + ", " + k + ", " + l + ", " + tmp);
					}
				}
			}
		}
		writer.println(ans);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;

	public void run() throws IOException {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
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