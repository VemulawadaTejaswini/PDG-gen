
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		long N = sc.nextLong();
		List<Long> A = new ArrayList<Long>();

		long dev = 2;
		int i = 0;
		while (true) {
			if (N % dev == 0) {
				A.add(dev);
				N = N / dev;
				i++;
				if (N == 1) {
					break;
				}
			} else {
				if (dev == 2) {
					dev++;
				} else {
					dev += 2;
				}
			}
			if (dev == 100000001) {
				break;
			}
		}

		if (A.size() == 0) {
			System.out.println(N - 1);
			return;
		}

		int D = A.size() - 1;
		long B = A.get(D);
		long C = 0;
		if (D >= 1) {
			C = A.get(D - 1);
		}
		if (D >= 2) {
			for (int j = 0; j < D - 1; j++) {
				if (B > C) {
					C = C * A.get(j);
				} else {
					B = B * A.get(j);
				}
			}
		}

		System.out.println(B + C - 2);
	}

}