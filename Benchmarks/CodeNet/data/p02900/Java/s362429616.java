import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long input1 = scanner.nextLong();
		long input2 = scanner.nextLong();

		long gcd = gcd(input1, input2);
		int count = 1;

		for (long i=2; i<=Math.sqrt(gcd); i++) {
			if (gcd % i == 0) {
				gcd /= i;
				count++;
			}
			while(gcd % i == 0) gcd /= i;
		}

		if (gcd > 1) count++;

		System.out.println(count);
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