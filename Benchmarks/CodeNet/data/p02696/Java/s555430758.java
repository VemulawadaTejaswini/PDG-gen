import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		long max = Long.MIN_VALUE;
		for (int i = 1; i <= c; i++) {
			long tmp = (long) (a * i / b) - (long) (a * (long) (i / b));
			if (tmp > max)  {
				max = tmp;
			}
		}
		System.out.println(max);
	}
}
