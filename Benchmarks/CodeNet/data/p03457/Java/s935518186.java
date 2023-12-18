import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int t[] = new int[n + 1];
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];

		t[0] = 0;
		x[0] = 0;
		y[0] = 0;

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			t[i + 1] = Integer.parseInt(str[0]);
			x[i + 1] = Integer.parseInt(str[1]);
			y[i + 1] = Integer.parseInt(str[2]);
		}
		for (int i = 0; i < n; i++) {
			int dt = t[i + 1] - t[i];
			int dist = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);
			if (dt < dist || dt % 2 != dist % 2) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}