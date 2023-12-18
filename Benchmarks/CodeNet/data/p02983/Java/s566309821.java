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
		return (l * (l + 1)) % 2019;
	}
}
