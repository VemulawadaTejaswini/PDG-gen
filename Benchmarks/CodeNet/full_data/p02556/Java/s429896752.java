import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]);
			x[i] = a + b;
			y[i] = a - b;
		}
		br.close();

		Arrays.sort(x);
		Arrays.sort(y);
		System.out.println(Math.max(x[n - 1] - x[0], y[n - 1] - y[0]));
	}
}
