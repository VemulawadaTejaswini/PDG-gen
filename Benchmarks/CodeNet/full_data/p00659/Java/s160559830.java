import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			String names[] = new String[n];
			int[] ns = new int[30];
			boolean[][] act = new boolean[n][30];
			for (int i = 0; i < n; i++) {
				String name = sc.next();
				names[i] = name;
				int m = sc.nextInt();
				for (int j = 0; j < m; j++) {
					int d = sc.nextInt();
					act[i][d] = true;
					ns[d]++;
				}
			}
			int index = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				int p = 0;
				for (int j = 0; j < 30; j++) {
					if (act[i][j]) {
						p += n - ns[j] + 1;
					}
				}
				if (min > p) {
					min = p;
					index = i;
				} else if (min == p) {
					if (names[i].compareTo(names[index]) < 0) {
						index = i;
					}
				}
			}
			System.out.println(min + " " + names[index]);
		}
	}
}