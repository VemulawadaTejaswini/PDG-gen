import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String K = (sc.next());
		BigInteger S = new BigInteger(K);
		int digit = 0;//桁数
		BigInteger s = S;

		BigInteger B[] = new BigInteger[200000];
		while (S.compareTo(BigInteger.valueOf(0)) > 0) {
			B[digit] = S.mod(BigInteger.valueOf(10));
			S = S.divide(BigInteger.valueOf(10));
			digit++;
		}
		int count = 0;
		BigInteger A[] = new BigInteger[digit];
		for (int i = digit - 1; i >= 0; i--) {
			A[i] = B[digit - i - 1];
		}
		for (int i = 0; i < digit - 4; i++) {
			for (int j = i + 3; j < digit; j++) {
				BigInteger cmp = BigInteger.valueOf(0);
				int c = 0;
				BigInteger d = BigInteger.valueOf(0);
				for (int k = i; k <= j; k++) {
					d = d.add(A[k]).mod(BigInteger.valueOf(3));
				}
				if (BigInteger.valueOf(0).compareTo(d) == 0) {
					for (int k = i; k <= j; k++) {
						BigInteger p = BigInteger.valueOf(10).pow((j - i - c));
						cmp = cmp.add(A[k].multiply(p));
						c++;
					}
					BigInteger CMP = cmp.mod(BigInteger.valueOf(2019));
					if (CMP.compareTo(BigInteger.valueOf(0)) == 0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
