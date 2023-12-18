import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BigInteger p = new BigInteger(scanner.next());
		String s = scanner.next();

		int[] remainCountArray = new int[p.intValue()];

		remainCountArray[0]++;
		for (int i = 0; i < n; i++) {
			remainCountArray[new BigInteger(s.substring(i)).remainder(p).intValue()]++;
		}

		System.out.println(Arrays.stream(remainCountArray).parallel().map(i -> i * (i - 1) / 2).sum());

	}

}
