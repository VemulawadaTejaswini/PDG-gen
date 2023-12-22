import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long l[] = new long[n];

		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			l[i] = Long.parseLong(str[i]);
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (l[i] + l[j] > l[k] && l[j] + l[k] > l[i] && l[k] + l[i] > l[j] && l[i] != l[j] && l[i] != l[k]
							&& l[j] != l[k]) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);
	}
}
