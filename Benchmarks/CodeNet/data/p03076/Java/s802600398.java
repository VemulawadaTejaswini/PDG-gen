import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		double[] ary = new double[5];
		for (int i = 0; i < 5; i++) {
			ary[i] = sc.nextInt();

		}

		for (int i = 0; i < ary.length - 1; i++) {
			if (ary[i] % 10 == 0) {
				continue;
			}
			if (ary[ary.length - 1] % 10 == 0 || ary[ary.length - 1] % 10 > ary[i] % 10) {
				double tmp = ary[ary.length - 1];
				ary[ary.length - 1] = ary[i];
				ary[i] = tmp;
			}

		}

		double a = 0;

		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length - 1) {
				a += ary[i];
			} else {

				a += Math.ceil(ary[i] / 10) * 10;
			}

		}

		System.out.println(String.format("%.0f", a));

	}

}