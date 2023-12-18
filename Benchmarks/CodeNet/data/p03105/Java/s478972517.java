import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);

		if (a > b) {
			System.out.println("0");
			return;
		}

		int count = 0;
		while (count < c) {
			if (b <= 0) {
				break;
			}
			b -= a;
			count++;
		}

		System.out.println(count);
	}
}
