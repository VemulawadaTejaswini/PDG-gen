import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int w = Integer.parseInt(str[0]);
		int h = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		int y = Integer.parseInt(str[3]);

		double ans = (double) (w * h) / 2;
		System.out.print(ans + " ");

		if (2 * x == w && 2 * y == h) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
		System.out.println();
	}
}
