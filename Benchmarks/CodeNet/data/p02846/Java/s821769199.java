import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long T1 = scn.nextLong(), T2 = scn.nextLong(), A1 = scn.nextLong(), A2 = scn.nextLong(), B1 = scn.nextLong(),
				B2 = scn.nextLong();
		long ans = 0;
		if (A1 < B1) {
			long buf1 = A1, buf2 = A2;
			A1 = B1;
			A2 = B2;
			B1 = buf1;
			B2 = buf2;
		}
		if (A2 < B2) {
			long d = (B1 * T1 + B2 * T2) - (A1 * T1 + A2 * T2);
			if (d == 0) {
				System.out.println("infinity");
				return;
			}
			if (d > 0) {
				if ((A1 -B1)* T1 % d == 0) {
					ans = (A1 - B1) * T1 * 2 / d;
				} else {
					ans = (A1 - B1) * T1 * 2 / d + 1;
				}
			}
		}
		System.out.println(ans);
	}

}
