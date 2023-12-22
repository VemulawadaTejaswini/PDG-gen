import java.util.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		BigInteger ans = new BigInteger("1");
		final BigInteger TEN_EIGHTEEN = new BigInteger("1000000000000000000");
		final BigInteger ZERO = new BigInteger("0");
		for (int i = 0; i < N; ++i) {
			BigInteger A = new BigInteger(sc.next());
			if(A.compareTo(ZERO) != 0){
				if (ans.multiply(A).compareTo(TEN_EIGHTEEN) <= 0) {
					ans = ans.multiply(A);
				} else {
					ans = new BigInteger("-1");
				}
			}else{
				ans = ZERO;
				break;
			}
		}
		// System.out.println(" "+ans.toString());
		sc.close();
		if (ans.compareTo(ZERO) == -1) {
			ans = new BigInteger("-1");
		}

		System.out.println(ans.toString());
	}
}
