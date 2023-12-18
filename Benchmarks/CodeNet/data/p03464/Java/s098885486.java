import java.util.*;
import java.math.*;

public class Main {
	static final int maxn = 100000 + 100;
	static int k;
	static boolean flag;
	static BigInteger[]num = new BigInteger[maxn];
	static BigInteger l, r;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		k = cin.nextInt();
		flag = true;
		for(int i = 1; i <= k; ++i) {
			num[i] = cin.nextBigInteger();
		}
		l = r = new BigInteger("2");
		for(int i = k; i > 0; --i) {
			if(num[i].compareTo(r) == 1) {
				flag = false;
				break;
			}
			if(l.mod(num[i]).compareTo(BigInteger.ZERO) != 0) {
				l = (l.divide(num[i]).add(BigInteger.ONE)).multiply(num[i]);
			}
			r = r.divide(num[i]).multiply(num[i]).add(num[i].subtract(BigInteger.ONE));
		}
		if(flag) {
			System.out.println(l + " " + r);
		} else {
			System.out.println(-1);
		}
		cin.close();
	}
}
