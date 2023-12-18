public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		long l = s.nextLong();
		long r = s.nextLong();
		System.out.println(calc(l, r));
	}

	public static long calc(long l, long r) {
		long next2019 = l - l % 2019 + 2019;
		if (l == 0 || r >= next2019) {
			return 0;
		}
		long min = Long.MAX_VALUE;
		for (long i = l; i < next2019 && i < r; i++) {
			for (long j = i + 1; j < next2019 && j <= r; j++) {
				min = Math.min(min, (i * j) % 2019);
				if ((i * j) % 2019 == 0) {
					return 0;
				}
			}
		}
		return min;
	}
}