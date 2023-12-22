import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int m = 4;
		int[] a = new int[m];
		Arrays.fill(a, Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(reader.readLine());
			if (tmp < a[0]) {
				a[3] = a[2]; a[2] = a[1]; a[1] = a[0]; a[0] = tmp;
			} else if (tmp < a[1]) {
				a[3] = a[2]; a[2] = a[1]; a[1] = tmp;
			} else if (tmp < a[2]) {
				a[3] = a[2]; a[2] = tmp;
			} else if (tmp < a[3]) {
				a[3] = tmp;
			}
		}
		reader.close();
		
		int[] ans = new int[3];
		Arrays.fill(ans, Integer.MAX_VALUE);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (i != j && a[i] != Integer.MAX_VALUE && a[j] != Integer.MAX_VALUE) {
					int tmp = Integer.parseInt(String.format("%d%d", a[i], a[j]));
					if (tmp < ans[0]) {
						ans[2] = ans[1]; ans[1] = ans[0]; ans[0] = tmp;
					} else if (tmp < ans[1]) {
						ans[2] = ans[1]; ans[1] = tmp;
					} else if (tmp < ans[2]) {
						ans[2] = tmp;
					}
				}
			}
		}
		System.out.println(ans[2]);
	}
}
