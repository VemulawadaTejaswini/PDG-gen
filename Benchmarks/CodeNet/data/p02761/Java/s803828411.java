import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];
		int min = 0;

		for (int i = 0; i < m; i++) {
			s[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}

		if (n == 1) {
			min = 0;
		} else {
			min = (int) Math.pow(10, n - 1);
		}

		for (int i = 0; i < Math.pow(10, n); i++) {
			String str = String.valueOf(i);
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				if (!str.substring(s[j] - 1, s[j]).equals(String.valueOf(c[j]))) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);

	}

}