import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		for (int i = a; i <= b; i++) {
			if (i % k == 0) {
				System.out.println("OK");
				return;
			}
		}
		System.out.println("NG");
	}
}
