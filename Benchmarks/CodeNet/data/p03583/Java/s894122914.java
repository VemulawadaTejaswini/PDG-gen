import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		for (long h = 1; h <= 3500; h++) {
			for (long n = 1; n <= 3500; n++) {
				long bunbo = 4 * h * n - N * n - N * h;
				if (bunbo == 0) {
					continue;
				}
				if ((N * h * n) % bunbo == 0) {
					long w = (N * h * n) / bunbo ;
					System.out.println(h + " " + n + " " + w);
					return;
				}
			}
		}
	}
}
