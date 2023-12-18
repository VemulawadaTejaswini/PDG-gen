import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int N = Integer.parseInt(str[0]);
		int D = Integer.parseInt(str[1]);
		int[][] x = new int[N][D];

		for (int n = 0; n < N; n++) {
			line = reader.readLine();
			String[] x_str = line.split(" ");
			for (int d = 0; d < D; d++) {
				x[n][d] = Integer.parseInt(x_str[d]);
			}
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int k = i+1; k < N; k++) {
				double a = 0.0;
				for (int d = 0; d < D; d++) {
					a += (x[i][d] - x[k][d]) * (x[i][d] - x[k][d]);
				}
				a = Math.sqrt(a);
				double a_dbl = a % 1;
				if (a_dbl < 0.00001 || 0.99999 < a_dbl) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		
	}
}
