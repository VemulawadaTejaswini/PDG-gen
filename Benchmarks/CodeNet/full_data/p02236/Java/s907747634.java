import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		double[] d = new double[2*n+1];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0, j = 1; i < n; i++, j+=2) {
			d[j] = Double.parseDouble(st.nextToken());
		}
		st = new StringTokenizer(reader.readLine());
		for (int i = 0, j = 0; i <= n; i++, j+=2) {
			d[j] = Double.parseDouble(st.nextToken());
		}
		reader.close();
		System.out.println(getMinCost(d));
	}

	private double getMinCost(double[] d) {
		int n = d.length;
		double[][] dp = new double[n+2][n+2];
		for (int s = 0; s < n; s++) {
			for (int i = 1, j = s + 2; j <= n+1; i++, j++) {
				dp[i][j] = Double.MAX_VALUE;
				double w = 0.0;
				for (int l = i-1; l < j-1; l++) {
					w += d[l];
				}
				for (int k = i; k < j; k++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j] + w);
				}
			}
//			printDPTable(dp);
		}
		return dp[1][n+1];
	}

/*
	private void printDPTable(double[][] dp) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				sb.append(String.format("%.5f", dp[i][j]));
				if (j != dp[0].length - 1) {
					sb.append("\t");
				}
			}
			sb.append("\n");
		}		
		System.out.println(sb.toString());
	}
	*/
}

