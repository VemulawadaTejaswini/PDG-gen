import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int h1 = Integer.parseInt(str[0]);
		int m1 = Integer.parseInt(str[1]);
		int h2 = Integer.parseInt(str[2]);
		int m2 = Integer.parseInt(str[3]);
		int k = Integer.parseInt(str[4]);

		int before = h1 * 60 + m1;
		int after = h2 * 60 + m2;

		System.out.println(after - k - before);
	}
}