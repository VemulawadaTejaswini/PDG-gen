import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int maxAbsValExpr(int[] x, int[] y) {
		int res = 0, n = x.length, P[] = { -1, 1 };
		for (int p : P) {
			for (int q : P) {
				int smallest = p * x[0] + q * y[0] + 0;
				for (int i = 1; i < n; ++i) {
					int cur = p * x[i] + q * y[i];
					res = Math.max(res, cur - smallest);
					smallest = Math.min(smallest, cur);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		
		System.out.println(maxAbsValExpr(x, y));
		
	}
}