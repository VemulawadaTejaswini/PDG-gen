import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);
		if (b - a <= k) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = a; i < a + k; i++) {
				System.out.println(i);
			}
			for (int i = b - k + 1; i <= b; i++) {
				System.out.println(i);
			}
		}
	}
}