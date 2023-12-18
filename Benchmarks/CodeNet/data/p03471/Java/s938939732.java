import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt()/1000;		// 1000の倍数が保証されている。
		int sub;
		int bill;
		boolean flag = false;

		int se = -1;
		int go = -1;
		int iti = -1;

//		long start = System.currentTimeMillis();

		// 全列挙
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				for (int k = 0; k <= N; k++) {
					bill = i+j+k;
					sub = addBill(i, j, k);
					if (bill >N) {
						break;
					}
					if (sub == Y) {
						se = i;
						go = j;
						iti = k;
						flag = true;
					} else if (sub > Y) {
						break;
					}

				} // end for k
				if (flag) break;
			} // end for j
			if (flag) break;
		} // end for i

//		long end = System.currentTimeMillis();

		System.out.println(iti + " " + go + " " + se);
//		System.out.println((end - start) + "ms");
	}

	public static int addBill(int se, int go, int iti) {
		return se + 5*go + 10*iti;
	}

}
