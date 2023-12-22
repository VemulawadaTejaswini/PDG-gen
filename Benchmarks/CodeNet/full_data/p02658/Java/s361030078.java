import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String s = br.readLine();

		String str[] = s.split(" ");

		for (int i = 0; i < n; i++) {
			if (str[i].equals("0")) {
				System.out.println("0");
				return;
			}
		}

		long ans = 1;
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(str[i]);
			if (ans * a > 1000000000000000000L) {
				System.out.println("-1");
				return;
			} else {
				ans *= a;
			}
		}
		System.out.println(ans);
	}
}