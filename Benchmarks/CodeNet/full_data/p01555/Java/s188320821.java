import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long S = sc.nextLong() - 1;
		long sum = 0;
		long left = 0;
		long right = 100000000000000000L;
		while (sum < S - 1000) {
			long m = (left + right) / 2;
			long ms = count(m);
			if (ms <= S) {
				sum = ms;
				left = m;
			} else {
				right = m;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (long i = left + 1; sb.length() < S - sum + 20; ++i) {
			boolean d3 = i % 3 == 0;
			boolean d5 = i % 5 == 0;
			if (d3) {
				sb.append(d5 ? "FizzBuzz" : "Fizz");
			} else {
				sb.append(d5 ? "Buzz" : "" + i);
			}
		}
		System.out.println(sb.toString().substring((int) (S - sum), (int) (S - sum + 20)));
	}

	static long count(long max) {
		long sum = 0;
		long base = 10;
		while (base - 1 <= max) {
			sum += count(base / 10, base - 1);
			base *= 10;
		}
		sum += count(base / 10, max);
		return sum;
	}

	static long count(long min, long max) {
		long c3 = max / 3 - (min - 1) / 3;
		long c5 = max / 5 - (min - 1) / 5;
		long c15 = max / 15 - (min - 1) / 15;
		long all = c3 + c5 - c15;
		return ("" + min).length() * (max - min + 1 - all) + (c3 + c5) * 4;
	}

}