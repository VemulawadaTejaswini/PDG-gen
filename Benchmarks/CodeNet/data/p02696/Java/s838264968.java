import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		long c = sc.nextLong();
		long max = Long.MIN_VALUE;
		for (long i = c; i >= 0l; --i) {
			long tmp = (long) (a * i / b) - (long) (a * (i / b));
			if (tmp >= max)  {
				max = (long) Math.floor(a * i / b) - (long) (a * Math.floor(i / b));
			} else {
				break;
			}
		}
		System.out.println(max);
	}
}
