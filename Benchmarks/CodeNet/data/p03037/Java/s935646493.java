import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		sc.close();

		int left = 1;
		int right = n;
		for (int i = 0; i < m; i++) {
			left = Math.max(left, l[i]);
			right = Math.min(right, r[i]);
		}
		if (left > right) {
			System.out.println(0);
		} else {
			System.out.println(right - left + 1);
		}
	}
}
