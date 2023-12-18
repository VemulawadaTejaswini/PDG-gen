import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length() < 4) {
			System.out.println(0);
			sc.close();
			return;
		}
		BigInteger bi1 = BigInteger.valueOf(2019);
		List<String> set = new LinkedList<>();
		int count = 0;
		for (int i = 0; i < s.length() - 3; i++) {
			for (int l = i + 4; l <= s.length(); l++) {
				set.add(s.substring(i, l));
			}
		}
		for (String st : set) {
			BigInteger bi = new BigInteger(st);

			if (bi.compareTo(bi1) >= 1 && bi.remainder(bi1) == BigInteger.ZERO) {
				count++;
			}
		}

		System.out.println(count);
		sc.close();

	}

}