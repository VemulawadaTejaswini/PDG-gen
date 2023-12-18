import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long A, B, C, D;
		for (int i = 0; i < n; i++) {
			A = scn.nextLong();
			B = scn.nextLong();
			C = scn.nextLong();
			D = scn.nextLong();
			boolean can = true;

			if (D %B == 0) {
				if(A % B > C)can = false;
			}else {
				long a = A % B;
				long b = D % B;
				for (; a < B; a+= b) {
					if (a > C) {
						can = false;
					}
				}
			}

			System.out.println(can ? "Yes" : "No");
		}
		scn.close();
	}
}