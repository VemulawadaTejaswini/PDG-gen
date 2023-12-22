import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				int i = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				new Main().call(i);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static int n;
	private static int i;
	private static int x;

	private void call(int n) {
		Main.n= n;
		i = 1;
		CHECK_NUM();
	}

	private void CHECK_NUM() {
		x = i;
		if (x % 3 == 0) {
			System.out.print(" " + i);
			END_CHECK_NUM();
		}
		else {
			INCLUDE3();
		}
	}

	private void INCLUDE3() {
		if (x % 10 == 3) {
			System.out.print(" " + i);
			END_CHECK_NUM();
		}
		else {
			x /= 10;
			END_CHECK_NUM();
		}
	}

	private void END_CHECK_NUM() {
		if (++i <= n) {
			CHECK_NUM();
		}
	}
}