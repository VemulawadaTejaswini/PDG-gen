import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		int h[] = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(h);

		long ans = Long.MAX_VALUE;
		for (int i = 0; i < n - k + 1; i++) {
			long diff = h[i + k - 1] - h[i];
			ans = Math.min(ans, diff);
		}

		System.out.println(ans);
	}
}
