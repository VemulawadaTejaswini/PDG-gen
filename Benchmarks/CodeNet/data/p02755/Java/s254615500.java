import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] l1 = r.readLine().split(" ");

		int a = Integer.valueOf(l1[0]);
		int b = Integer.valueOf(l1[1]);

		boolean found = false;
		for (int i = 0;; ++i) {
			int ea = (int) (i * 1.08) - i;
			int eb = (int) (i * 1.1) - i;

			if (ea == a && eb == b) {
				System.out.println(i);
				found = true;
				break;
			}

			if (eb > 100) {
				break;
			}
		}

		if (!found) {
			System.out.println(-1);
		}

		r.close();
	}
}