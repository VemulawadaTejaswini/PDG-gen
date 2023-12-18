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

		if (n % 2 == 0)
			System.out.println(a[n - 1] + " " + a[n / 2 - 1]);
		else
			System.out.println(a[n - 1] + " " + a[n / 2]);
	}
}
