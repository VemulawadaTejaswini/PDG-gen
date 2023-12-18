import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		int n = Integer.parseInt(s);

		int x1 = (int) ((double) n / 1.09);
		int x2 = (int) ((double) n / 1.07);

		boolean found = false;

		for (int i = x1; i < x2; ++i) {
			if ((Math.floor(i * 1.08)) == n) {
				System.out.println(n);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println(":(");
		}

		r.close();
	}
}