import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long max = Long.MIN_VALUE;
		for (int i = c; i > 0; --i) {
			long tmp = (long) (a * i / b) - (long) (a * (long) (i / b));
			if (tmp >= max)  {
				max = tmp;
			} else {
				break;
			}
		}
		System.out.println(max);
	}
}
