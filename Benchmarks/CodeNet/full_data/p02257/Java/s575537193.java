import java.util.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; ++i) {
			String str;
			str = sc.next();
			if (new BigInteger(s).isProbablePrime(5)) {
				++count;
			}
		}
		System.out.println(count);
	}
}
