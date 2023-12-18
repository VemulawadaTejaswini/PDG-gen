import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String K = (sc.next());
		BigInteger S = new BigInteger(K);
		int count = 0;//桁数
		BigInteger s = S;

		BigInteger B[] = new BigInteger[99999999];
		while (S.compareTo(BigInteger.valueOf(0)) > 0) {
			B[count] = S.mod(BigInteger.valueOf(10));
			S = S.divide(BigInteger.valueOf(10));
			count++;
		}
		int cou = 0;
		BigInteger A[] = new BigInteger[count];
		for (int i = count - 1; i >= 0; i--) {
			A[i] = B[count - i - 1];
		}
		for (int i = 0; i < count - 4; i++) {
			for (int j = i + 3; j < count; j++) {
				BigInteger cmp = BigInteger.valueOf(0);
				int c = 0;
				BigInteger d = BigInteger.valueOf(0);
				for (int k = i; k <= j; k++) {
					BigInteger p = BigInteger.valueOf(10).pow((j - i - c));
					cmp = cmp.add(A[k].multiply(p));
					c++;
					d = d.add(A[k]);
				}
				if (BigInteger.valueOf(0).compareTo(d.mod(BigInteger.valueOf(3))) == 0) {
					BigInteger CMP = cmp.mod(BigInteger.valueOf(2019));
					if (CMP.compareTo(BigInteger.valueOf(0)) == 0) {
						cou++;
					}
				}
			}
		}
		System.out.println(cou);
	}
}
