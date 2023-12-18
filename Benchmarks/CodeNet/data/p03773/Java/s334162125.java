import java.util.stream.LongStream;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextLong()));
	}

	public static long calc(long n) {
		return LongStream.rangeClosed(1, (int) Math.sqrt(n))
				.filter(a -> n % a == 0)
				.map(a -> Main.calcF(a, n / a)).min().getAsLong();
	}

	public static int calcF(long a, long b) {
		return Math.max((int) (Math.log10(a) + 1), (int) (Math.log10(b) + 1));
	}

}