import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		long sum = 0;

		long[] bar = new long[A];

		for (int i = 0; i < A; i++) {
			long let = sc.nextLong();
			sum += let;
			bar[i] = sum;
		}

		for (int i = 0; i < bar.length; i++) {
			if (bar[i] == sum / 2) {
				System.out.println(0);
				break;
			}else if (bar[i] > sum / 2) {
				System.out.println(bar[i] -(sum - bar[i]));
				break;
			}
		}
	}
}