import java.io.IOException;

public class question1 {

	public static void main(String[] args) throws IOException {

		// Declare
		String out = null;

		// receive number
		int n = System.in.read();

		// check
		if (1 < n && n <= 999) {
			out = "ABC";
		} else if (1000 <= n && n <= 1998) {
			out = "ABD";
		}

		// Didplay
		System.out.print(out);
	}
}