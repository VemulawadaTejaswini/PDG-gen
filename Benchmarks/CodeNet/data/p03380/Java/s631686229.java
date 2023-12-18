import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long a[] = new long[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		Arrays.sort(a);

		long ai = a[n - 1];
		long aj = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] == ai)
				continue;
			if (Math.abs(a[i] - ai / 2) <= Math.abs(aj - ai / 2)) {
				aj = a[i];
			}
		}
		System.out.println(ai + " " + aj);
	}
}
