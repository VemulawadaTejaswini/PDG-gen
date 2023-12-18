import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long count = n - 1;
		for (long i = 1; i < n; i++) {
			long minCount = i + n / i - 2;
			if (n % i == 0 && minCount < count) {
				count = minCount;
			}
		}
		System.out.println(count);
	}
}