import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");
		int p[] = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = (Integer.parseInt(str[i]) + 1);
		}

		int s[] = new int[n + 1];
		s[0] = 0;

		for (int i = 0; i < n; i++) {
			s[i + 1] = s[i] + p[i];
		}

		int max = 0;
		for (int i = 0; i <= n - k; i++) {
			max = Math.max(max, s[i + k] - s[i]);
		}
		System.out.println((double) max / 2);
	}
}
