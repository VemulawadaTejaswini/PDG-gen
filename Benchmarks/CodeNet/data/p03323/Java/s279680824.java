import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		solve(is);
	}

	private static void solve(InputStream is) {
		try (Scanner cin = new Scanner(is)) {
			int m = cin.nextInt();
			int n = cin.nextInt();

			if (m > 8 || n > 8) {
				System.out.println("4:(");
			} else {
				System.out.println("Yay!");
			}
		}
	}
}
