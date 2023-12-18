import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger div = new BigInteger("2019");
		BigInteger zero = new BigInteger("0");

		String S = sc.next();

		int counter = 0;
		for (int i = 0; i <= S.length() - 1; i++) {
			for (int j = i + 3; j <= S.length(); j++) {
				String tmp = S.substring(i, j);

				if (tmp.length() < 4) {
				} else {
					BigInteger current = new BigInteger(tmp);
					if (current.remainder(div).equals(zero)) {
						counter++;
					}
				}
			}
		}

		System.out.println(counter);
	}

}