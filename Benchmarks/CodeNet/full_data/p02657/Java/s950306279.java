import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long p = 1;
		long tooBig = 1000000000000000000L;

		long n = sc.nextLong();

		while (sc.hasNext()) {
			if (sc.hasNextLong()) {
				p *= sc.nextLong();
				if (p > tooBig) {
					System.out.println("-1");
					return;
				}
			}
		}

		System.out.println(p);
	}
}