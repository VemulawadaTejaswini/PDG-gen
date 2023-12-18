import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int N = sc.nextInt();
			long ans = 0;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					for (int k = 1; k <= N; k++) {
						int gcd = IntStream.of(i, j, k)
								.mapToObj(BigInteger::valueOf)
								.reduce(BigInteger::gcd)
								.orElse(BigInteger.ZERO)
								.intValue();
						ans += gcd;
					}
				}
			}
			System.out.println(ans);

		} finally

		{
			sc.close();
		}
	}

}
