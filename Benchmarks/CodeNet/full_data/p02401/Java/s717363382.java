//Simple Calculator
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input;
		while (!(input = in.readLine()).equals("0 ? 0")) {
			String[] aOpb = input.split(" ");
			// String[] aOpb = "1 ? 2".split(" ");
			int a = Integer.parseInt(aOpb[0]);
			String op = aOpb[1];
			int b = Integer.parseInt(aOpb[2]);

			if (op.equals("?")) {
				break;
			}

			int ans = 0;

			if (op.equals("+")) {
				ans = a+b;
			} else if (op.equals("-")) {
				ans = a-b;
			} else if (op.equals("*")) {
				ans = a*b;
			} else if (op.equals("/")) {
				ans = a/b;
			}
			System.out.println(ans);
		}

	}
}