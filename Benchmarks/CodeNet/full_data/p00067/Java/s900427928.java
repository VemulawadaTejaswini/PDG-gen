import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][];
		int count;

		a = new int[12][12];
		while (sc.hasNext()) {
			count = 0;
			for (int i = 0; i  <12; i++) {
				String str = sc.next();
				for (int j = 0; j < 12; j++) {
					a[i][j] = str.charAt(j) - '0' - 1;
				}
			}
			while (check(a)) {
				for (int i = 0; i < 12; i++) {
					for (int j = 0; j < 12; j++) {
						if (a[i][j] == 0) {
							count++;
							expand(a, count, i, j);
						}
					}
				}
			}
			System.out.println(count);
		}
	}

	public static boolean check(int a[][]) {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (a[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static void expand(int a[][], int num, int i, int j) {
		if (0 <= i && i < 12 && 0 <= j && j < 12 && a[i][j] == 0) {
			a[i][j] = num;
		} else {
			return ;
		}
		expand(a, num, i - 1, j);
		expand(a, num, i + 1, j);
		expand(a, num, i, j - 1);
		expand(a, num, i, j + 1);
	}
}