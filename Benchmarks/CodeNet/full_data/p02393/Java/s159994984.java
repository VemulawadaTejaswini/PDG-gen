//Sorting Three Numbers
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] abc = in.readLine().split(" ");

		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);

		if (a <= b && b <= c) {
			System.out.println(a + " " + b + " " + c);
		} else if (a <= c && c <= b) {
			System.out.println(a + " " + c + " " + b);
		} else if (b <= a && a <= c) {
			System.out.println(b + " " + a + " " + c);
		} else if (b <= c && c <= a) {
			System.out.println(b + " " + c + " " + a);
		} else if (c <= a && a <= b) {
			System.out.println(c + " " + a + " " + b);
		} else if (c <= b && b <= a) {
			System.out.println(c + " " + b + " " + a);
		}
	}
}