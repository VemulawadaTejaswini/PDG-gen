import java.util.Scanner;

public class Main {
	public static int n;
	public static int m;
	public static int len;
	public static int str[][];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		str = new int[m][2];
		boolean flag = false;
		int tempA = 0;
		int tempB = 0;

		for (int i = 0; i < m; i++) {
			tempA = scan.nextInt();
			tempB = scan.nextInt();

			if ((tempA == 1) || (tempB == n)) {
				str[len][0] = tempA;
				str[len][1] = tempB;
				len ++;
			}
		}
		for (int i = 0; i < len; i++) {
			if (str[i][0] == 1) {
				flag = sub(str[i][1]);
				if (flag) {
					System.out.println("POSSIBLE");
					return;
				}
			}
		}
		System.out.println("IMPOSSIBLE");

	}

	public static boolean sub(int a) {
		for (int i = 0; i < len; i++) {
			if ((str[i][0] == a) && (str[i][1] == n)) {
				return true;
			}
		}

		return false;

	}

}