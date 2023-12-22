import java.util.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		BigInteger ans = new BigInteger("1");
		final BigInteger TEN_EIGHTEEN = new BigInteger("1000000000000000000");
		final BigInteger ZERO = new BigInteger("0");
		final BigInteger OVER = new BigInteger("-1");
		String[] s = new String[N];
		Boolean flag_z = false;
		for (int i = 0; i < N; ++i) {
			s[i] = sc.next();
			if (s[i].equals("0")) {
				flag_z = true;
			}
		}
		if (flag_z) {
			ans = ZERO;
		} else {
			for (int i = 0; i < N; ++i) {
				BigInteger A = new BigInteger(s[i]);
				if (A.compareTo(ZERO) != 0) {
					if (ans.multiply(A).compareTo(TEN_EIGHTEEN) <= 0) {
						ans = ans.multiply(A);
					} else {
						ans = OVER;
						break;
					}
				} else {
					ans = ZERO;
					break;
				}
			}
		}
		// System.out.println(" "+ans.toString());
		sc.close();
		if (ans.compareTo(ZERO) == -1) {
			System.out.println("-1");
		}else{
			System.out.println(ans.toString());
		}
	}
}
