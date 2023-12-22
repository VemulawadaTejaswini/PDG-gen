import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int k = Integer.parseInt(str[3]);

		if (a >= k) {
			System.out.println(a);
		} else {
			if (a + b >= k) {
				System.out.println(a);
			} else {
				int n = k - a - c;
				System.out.println(n);
			}
		}
	}
}
