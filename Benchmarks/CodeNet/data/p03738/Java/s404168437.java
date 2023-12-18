import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		String ans = "";

		if (a.compareTo(b) == -1) {
			ans = "LESS";
		} else if (a.compareTo(b) == 0) {
			ans = "EQUAL";
		} else {
			ans = "GREATER";
		}

		System.out.println(ans);
	}
}
