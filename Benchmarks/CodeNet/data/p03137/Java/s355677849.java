import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		if (n >= m) {
			System.out.println("0");
			return;
		}

		Integer x[] = new Integer[m];

		str = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			x[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(x);

		int dist = Math.abs(x[m - 1] - x[0]);

		Integer diff[] = new Integer[m - 1];

		for (int i = 0; i < m - 1; i++) {
			diff[i] = Math.abs(x[i + 1] - x[i]);
		}

		Arrays.sort(diff, Comparator.reverseOrder());

		for (int i = 0; i < n - 1; i++) {
			dist -= diff[i];
		}

		System.out.println(dist);
	}
}
