import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static final long MOD = 1000000007;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int answer = 0;

		if (Integer.parseInt(S) >= 2019) {
			for (int i = 0; i < S.length(); i++) {
				for (int k = i + 3; k < S.length() + 1; k++) {
					BigInteger temp = BigInteger.valueOf(Long.parseLong(S.substring(i, k)));
					if (temp.mod(BigInteger.valueOf(2019)).equals(BigInteger.ZERO)) answer++;
				}
			}
		}

		System.out.println(answer);
	}
}