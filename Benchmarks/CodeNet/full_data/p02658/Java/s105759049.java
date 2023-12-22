import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		long res = 1;
		double realRes = 1;
		boolean isOver = false;

		for (long elt: a) {
			elt = sc.nextLong();

//			int keta1 = keta(elt);
//			int keta2 = keta(res);

			res *= elt;
			realRes *= elt;

//			int keta_res = keta(res);
//
//			if ((res != 1000000000000000000l) && (keta1 + keta2 - 1 >= 18)) {
//				isOver = true;
//			}
//
//			if (res > 1000000000000000000l) {
//				isOver = true;
//			}
		}

//		if(res != 0 && isOver) {
//		if((res != 1000000000000000000l) && (keta(realRes) > 18)) {
		if((res != 1000000000000000000l) && (realRes >= 1000000000000000000l)) {
			res = -1;
		}

		System.out.printf("%d", res);
	}

	private static int keta (long num) {
		long tmp = num;
		int res = 0;
		while (tmp > 0) {
			tmp /= 10;
			res++;
		}
		return res;
	}
	private static int keta (double num) {
		double tmp = num;
		int res = 0;
		while (tmp >= 1) {
			tmp /= 10;
			res++;
		}
		return res;
	}
}
