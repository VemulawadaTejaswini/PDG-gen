import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static int INTE = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String p = sc.next();
		String s = sc.next();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				String st = s.substring(j, 1 + j + i);
				map.compute(st, (k, v) -> v == null ? 1 : v + 1);
			}
		}
		map.forEach((a, b) -> {
			BigInteger f = new BigInteger(a);
			if (f.remainder(new BigInteger(p)) == BigInteger.ZERO) {
				INTE = INTE + b;
			}
		});
		System.out.println(INTE);
		sc.close();
	}
}