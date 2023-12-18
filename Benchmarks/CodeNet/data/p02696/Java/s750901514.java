import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		long c = sc.nextLong();
		long max = Long.MIN_VALUE;
		long max2 = Long.MIN_VALUE;
		for (long i = c; i >= 0; --i) {
			long tmp = (long) (a * i / b) - (long) (a * (long) (i / b));
			if (tmp >= max)  {
				max = tmp;
			} else {
				break;
			}
		}
		for (long i = 0; i <= c; ++i) {
			long tmp = (long) (a * i / b) - (long) (a * (long) (i / b));
			if (tmp >= max2)  {
				max2 = tmp;
			} else {
				break;
			}
		}
		System.out.println(Math.max(max, max2));
	}
}
