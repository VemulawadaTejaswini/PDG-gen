import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int n = str.length();

		for (int i = 0; i < n - 2; i++) {
			str = str.substring(0, str.length() - 1);

			String front = str.substring(0, str.length() / 2);
			String back = str.substring(str.length() / 2, str.length());

			if (str.length() % 2 != 0) {
				continue;
			}

			if (front.equals(back)) {
				System.out.println(str.length());
				return;
			}
		}
	}
}