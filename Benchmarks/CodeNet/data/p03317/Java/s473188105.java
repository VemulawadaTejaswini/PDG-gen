import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		int a[] = new int[n];

		int indexOne = 0;
		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);

			if (a[i] == 1) {
				indexOne = i + 1;
			}
		}

		double ans = Math.floor((n - 1) / (double) (k - 1));
		if ((n - 1) % (double) (k - 1) != 0) {
			ans += 1;
		}

		System.out.println((int) ans);
	}
}