import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		solve(is);
	}

	private static void solve(InputStream is) {
		try (Scanner cin = new Scanner(is)) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();

			int ans = (a - b) - ((a - b) / c) * c;
			System.out.println(ans);
		}
	}
}