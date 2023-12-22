
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			System.out.println(sumOfFourInt(n));
		}
	}

	static int sumOfFourInt(int n) {
		int a, b, c, d;
		int num = 0;
		L1: for (a = 0; a <= 9; a++) {
			if (a > n)
				break L1;
			L2: for (b = 0; b <= 9; b++) {
				if (a + b > n)
					break L2;
				L3: for (c = 0; c <= 9; c++) {
					if (a + b + c > n)
						break L3;
					L4: for (d = 0; d <= 9; d++) {
						if (a + b + c + d > n)
							break L4;
						if (a + b + c + d == n)
							num++;
					}
				}
			}
		}
		return num;
	}
}