import java.util.stream.LongStream;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextInt(), s.nextInt(), s.nextInt(),
				s.nextInt(), s.nextInt()));
	}

	public static long calc(int a, int b, int c, int x, int y) {
		return LongStream.iterate(0, n -> n + 2).limit(Math.max(x, y) + 1)
				.reduce(
						Long.MAX_VALUE,
						(res, cn) -> Math.min(Math.max(a * (x - cn / 2), 0)
								+ Math.max(b * (y - cn / 2), 0) + c * cn, res));

	}

}