import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int s[] = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			s[i] = Integer.parseInt(br.readLine());
			sum += s[i];
		}

		Arrays.sort(s);

		if (sum % 10 != 0) {
			System.out.println(sum);
		} else {
			for (int i = 0; i < n; i++) {
				if (s[i] % 10 != 0) {
					System.out.println(sum - s[i]);
					return;
				}
			}
			System.out.println("0");
		}
	}
}
