
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int ans = 0;
		if (2 * n <= m) {
			ans += n;
			m -= (2 * n);
			ans += (int)m/4;
		} else {
			ans += (int)m/2;
		}
		System.out.println(ans);
	}

}
