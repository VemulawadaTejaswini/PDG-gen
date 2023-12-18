import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] l1 = r.readLine().split(" ");

		int n = Integer.parseInt(l1[0]);
		int a = Integer.parseInt(l1[1]);
		int b = Integer.parseInt(l1[2]);

		int cnt = n / (a + b);
		int res = n % (a + b);
		if (res > a) {
			res = a;
		}

		System.out.println(String.valueOf(a * cnt + res));

		r.close();
	}
}