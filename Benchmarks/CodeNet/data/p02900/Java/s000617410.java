import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long input1 = scanner.nextLong();
		long input2 = scanner.nextLong();

		long gcd = gcd(input1, input2);
		Set<Long> set = new HashSet<>();

		for (long i=2;i<=gcd;i++) {
			if (gcd % i == 0) {
				gcd /= i;
				set.add(i);
				i = 1;
			}
		}

		set.add((long)1);
		System.out.println(set.size());
	}

    static long gcd(long a, long b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        long re = max % min;
        if (re == 0)
            return min;
        return gcd(min, re);
    }
}
