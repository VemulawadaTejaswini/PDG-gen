import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		long d = scanner.nextLong();
		long e = scanner.nextLong();

		long bottleneck = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
		long tmp = (long)Math.ceil(n / bottleneck);
		long res = 5 + (long)Math.ceil(n / bottleneck) - 1;

		System.out.println(res);
	}

}
