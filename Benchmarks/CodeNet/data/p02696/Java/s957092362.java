import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		long c = sc.nextLong();
		long max = Long.MIN_VALUE;
		int count = 0;
		for (long i = c; i >= 0; --i) {
			long tmp = (long) (a * i / b) - (long) (a * (long) (i / b));
			if (tmp > max)  {
				max = tmp;
				++count;
			} else if (count > 5) {
				break;
			}
		}
		System.out.println(max);
	}
}
