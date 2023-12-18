import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static final long MOD = 1000000007;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int answer = 0;
		int[] count = new int[2019];
		count[0]++;

		for (int i = 0; i < S.length(); i++) {
			BigInteger num = new BigInteger(S.substring(S.length() - i - 1));
			count[num.mod(BigInteger.valueOf(2019)).intValue()]++;
		}

		for (int i = 0; i < 2019; i++) {
			answer += (count[i] + (count[i] - 1)) / 2;
		}

		System.out.println(answer);
	}
}