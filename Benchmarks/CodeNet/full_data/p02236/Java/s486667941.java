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
		double[] p = new double[n+1];
		double[] q = new double[n+1];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			p[i] = Double.parseDouble(st.nextToken());
		}
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i <= n; i++) {
			q[i] = Double.parseDouble(st.nextToken());
		}
		reader.close();
		System.out.println(getMinCost(n, p, q));
	}

	private double getMinCost(int n, double[] p, double[] q) {
		double[][] e = new double[n+2][n+1];
		double[][] w = new double[n+2][n+1];
		for (int i = 0; i <= n; i++) {
			e[i+1][i] = q[i];
			w[i+1][i] = q[i];
		}
		for (int l = 1; l <= n; l++) {
			for (int i = 1; i <= n - l + 1; i++) {
				int j = i + l - 1;
				e[i][j] = Double.MAX_VALUE;
				w[i][j] = w[i][j - 1] + p[j] + q[j];
				for (int r = i; r <= j; r++) {
					e[i][j] = Math.min(e[i][j], e[i][r-1] + e[r+1][j] + w[i][j]);
				}
			}
		}
		return e[1][n];
	}
}

