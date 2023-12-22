import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		long res = 1;

		for (long elt: a) {
			elt = sc.nextLong();
			res *= elt;
			if (res > Math.pow(10, 17)) {
				res = -1;
				break;
			}
		}


		System.out.printf("%d", res);
	}
}
