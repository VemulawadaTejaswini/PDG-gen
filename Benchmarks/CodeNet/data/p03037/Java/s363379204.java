import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 1; i <= n; i++) {
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				if (!(l[j] <=i && i <= r[j])) {
					flag = false;
				}
			}
			if (flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}