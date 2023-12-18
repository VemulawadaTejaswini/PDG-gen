import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] st = r.readLine().split(" ");
		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);
		int c = Integer.parseInt(st[2]);
		int d = Integer.parseInt(st[3]);

		while (true) {
			// t
			c = c - b;
			if (c <= 0) {
				System.out.println("Yes");
				break;
			}

			// a
			a = a - d;
			if (a <= 0) {
				System.out.println("No");
				break;
			}
		}

		r.close();
	}
}