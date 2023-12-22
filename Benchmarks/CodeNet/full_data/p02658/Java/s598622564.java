import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		long a[] = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);

			if (a[i] == 0) {
				System.out.println("0");
				return;
			}
		}

		long sum = 1L;
		long max = 1000000000000000000L;
		for (int i = 0; i < n; i++) {
			if (a[i] <= max / sum) {
				sum *= a[i];
			} else {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(sum);
	}
}