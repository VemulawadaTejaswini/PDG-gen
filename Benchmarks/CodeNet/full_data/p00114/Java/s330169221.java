import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);

		long[] num = new long[6];

		loop: while (true) {
			for (int i = 0; i < num.length; ++i) {
				num[i] = Integer.parseInt(sc.next());
			}
			if (max(num) != 0) {
				System.out.println(lcm(calc(num)));
			} else {
				break loop;
			}
		}
	}

	private static long[] calc(long... num) {
		long[] no = new long[(int)num.length / 2];
		for (int i = 0; i < num.length; i += 2) {
			long val = 1;
			int a = i, m = i + 1, count = 0;
			do {
				val = (num[a] * val) % num[m];
				++count;
			} while (val != 1);
			no[i / 2] = count;
		}
		return no;
	}

	private static long lcm(long... num) {
		long max = max(num);
		for (long i = 2; i <= max; ++i) {
			long[] no = mod0(i, num.clone());
			if (no != null) {
				return i * lcm(no);
			}
		}
		long sum = 1;
		for (long n : num) {
			sum *= n;
		}
		return sum;
	}

	private static long[] mod0(long n, long... num) {
		long flag = 0;
		for (int i = 0; i < num.length; ++i) {
			if (num[i] % n == 0) {
				num[i] /= n;
				++flag;
			}
		}
		if (1 < flag) {
			return num;
		} else {
			return null;
		}
	}

	private static long max(long... num) {
		long max = 0;
		for (long n : num) {
			if (max < n) {
				max = n;
			}
		}
		return max;
	}

}