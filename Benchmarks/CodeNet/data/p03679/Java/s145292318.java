import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void solve() throws IOException {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a - b >= 0)
			System.out.println("delicious");
		else if (a - b < 0 && a - b >= -x)
			System.out.println("safe");
		else if (a - b < -x)
			System.out.println("dangerous");

		sc.close();
	}

	public static void main(String[] args) {
		try {
			solve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
