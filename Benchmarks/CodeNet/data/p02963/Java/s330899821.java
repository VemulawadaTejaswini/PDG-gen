
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long s = sc.nextLong();

			long s1 = 1;
			long s2 = 1;
			for (long i : bunkai(s)) {
				if (s1 < s2) {
					s1 *= i;
				} else {
					s2 *= i;
				}
			}

			System.out.println("0 " + s1 + " " + s2 + " 0 0 0");
		}
	}

	private static List<Long> bunkai(long num) {
		List<Long> result = new ArrayList<Long>();

		while (num % 2 == 0) {
			result.add(2l);
			num /= 2;
		}

		long i = 3;
		while (num != 1) {
			if (num % i == 0) {
				result.add(i);
				num /= i;
			} else {
				i += 2;
			}
		}

		return result;
	}
}