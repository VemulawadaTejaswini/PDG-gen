import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		int n = s.length;
		if (s[0] == '0' || s[n - 2] == '0' || s[n - 1] == '1') {
			System.out.println(-1);
			return;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (s[i - 1] != s[n - 1 - i]) {
				System.out.println(-1);
				return;
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		pw.println("1 " + n);
		int now = 1;
		for (int i = 2; i <= n / 2; i++) {
			pw.println(now + " " + i);
			if (s[i - 1] == '1') {
				now++;
			}
		}
		for (int i = n / 2 + 1; i < n; i++) {
			pw.println(now + " " + i);
		}
		pw.flush();
	}
}
