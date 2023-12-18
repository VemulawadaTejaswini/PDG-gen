import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		if (!str[0].equals("0")) {
			System.out.println("0");
			return;
		}

		int s[] = new int[100010];
		int max = 0;

		for (int i = 0; i < n; i++) {
			int d = Integer.parseInt(str[i]);
			s[d]++;
			max = Math.max(max, d);
		}

		long ans = 1;
		for (int i = 1; i < max; i++) {
			ans *= Math.pow(s[i], s[i + 1]) % 998244353;
		}

		System.out.println(ans % 998244353);
	}
}