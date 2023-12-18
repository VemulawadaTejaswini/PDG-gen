import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long x = Long.parseLong(str[0]);
		long y = Long.parseLong(str[1]);

		long ans = Long.MAX_VALUE;
		if (x < y) {
			ans = y - x;
		}
		if ((-1) * x <= y) {
			long dist = y - (-1) * x;
			ans = Math.min(dist + 1, ans);

		}
		if (Math.abs(x) < Math.abs(y)) {
			long dist = Math.abs(y) - Math.abs(x);
			ans = Math.min(dist + 2, ans);
		}
		System.out.println(ans);
	}
}
