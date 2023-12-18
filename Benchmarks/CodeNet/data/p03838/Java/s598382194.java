import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		if ((-1) * a == b) {
			System.out.println("1");
			return;
		}

		if (a > b) {
			int up = a - b;
			System.out.println(up + 2);
		} else {
			int up = b - a;
			System.out.println(up);
		}
	}
}