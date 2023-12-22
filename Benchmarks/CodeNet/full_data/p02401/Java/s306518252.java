import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	private static int res;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] str = in.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			String op = str[1];
			int b = Integer.parseInt(str[2]);

			if (op.equals("+")) {
				res = a + b;
			} else if (op.equals("-")) {
				res = a - b;
			} else if (op.equals("*")) {
				res = a * b;
			} else if (op.equals("/")) {
				res = a / b;
			} else if (op.equals("?")) {
				break;
			}
			System.out.printf("%d%n", res);
		}
	}
}