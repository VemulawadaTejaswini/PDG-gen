import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		double max = 00;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				double val = Math.hypot(x[i] - x[j], y[i] - y[j]);
				max = Math.max(max, val);
			}
		}
		System.out.println(max / 2);
	}

	static boolean isOk(int[] x, int[] y, double val) {
		for (int i = 0; i < y.length; i++) {
			
		}
		return true;
	}
}
