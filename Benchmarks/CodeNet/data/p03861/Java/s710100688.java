import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long x = Long.parseLong(str[2]);

		long bb = b / x;
		long aa = (a - 1) / x;

		if (a == 0) {
			aa = -1;
		}

		System.out.println(bb - aa);
	}
}