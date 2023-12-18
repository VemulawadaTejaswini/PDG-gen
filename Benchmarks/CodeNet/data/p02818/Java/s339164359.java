import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		String[] str = s.split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);

		int t = a - k;
		int u = b + t;

		if (t < 0) {
			a = 0;
		} else {
			a = t;
		}

		if (u < 0) {
			b = 0;
		} else {
			b = u;
		}

		System.out.printf("%d %d\n", a, b);
		r.close();
	}
}