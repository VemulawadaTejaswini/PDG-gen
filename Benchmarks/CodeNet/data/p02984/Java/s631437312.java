import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		long a[] = new long[n];

		long x[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);

			if (i % 2 == 0)
				x[0] += a[i];
			else
				x[0] -= a[i];
		}

		for (int i = 1; i < n; i++) {
			x[i] = 2 * a[i - 1] - x[i - 1];
		}

		System.out.print(x[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + x[i]);
		}
		System.out.println();
	}
}
