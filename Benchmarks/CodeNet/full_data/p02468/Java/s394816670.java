import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ");
		int m = Integer.parseInt(num[0]);
		int n = Integer.parseInt(num[1]);
		long ans = m;
		for (int i = 1; i < n; i++) {
			ans = (ans * m) % 1_000_000_007;
		}
		System.out.println(ans);
	}
}