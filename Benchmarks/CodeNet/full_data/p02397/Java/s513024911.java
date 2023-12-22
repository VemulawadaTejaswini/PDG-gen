import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {
	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int val1, val2;
		do {
			val1 = Integer.parseInt(in.readLine());
			val2 = Integer.parseInt(in.readLine());
			if (val1 > val2) {
				int temp = val1;
				val1 = val2;
				val2 = temp;

			}
			if (val1 == 0 && val2 == 0) {
				break;
			}
			out.println(val1 + " " + val2);
		} while (val1 != 0 || val2 != 0);

	}
}