import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		long[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		BigInteger ans = BigInteger.valueOf(line[0]);

		BigInteger lev =BigInteger.valueOf(1000000000000000000L);


		for (int i = 1; i < line.length; i++) {
			ans = ans.multiply(BigInteger.valueOf(line[i]));
		}
		if (ans.compareTo(lev) == 1) {
			System.out.println(-1);
		}
		System.out.println(ans);
	}
}
