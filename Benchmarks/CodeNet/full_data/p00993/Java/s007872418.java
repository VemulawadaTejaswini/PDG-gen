import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BigInteger mul = BigInteger.valueOf(2);
		for (int i = 3; i <= 1501; i += 2) {
			boolean ok = true;
			for (int j = 3; j * j <= i; j += 2) {
				if (i % j == 0) {
					ok = false;
					break;
				}
			}
			if (ok) {
				mul = mul.multiply(BigInteger.valueOf(i));
			}
		}
		int N = sc.nextInt();
		mul = mul.add(BigInteger.valueOf(2));
		System.out.println(mul);
		for (int i = 0; i < N; ++i) {
			int b = i + 2;
			for (int j = 2; j <= b; ++j) {
				if (b % j == 0) {
					System.out.println(j);
					break;
				}
			}
		}
	}

}