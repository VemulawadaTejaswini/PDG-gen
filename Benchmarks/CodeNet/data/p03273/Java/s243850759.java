import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String a[] = new String[H];

		for (int i = 0; i < H; i ++) {
			a[i] = sc.next();
		}

		boolean row[] = new boolean[H];
		boolean col[] = new boolean[W];

		Arrays.fill(row, false);
		Arrays.fill(col, false);


		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (a[i].charAt(j) == '#') {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i = 0; i < H; i++) {
			if (row[i]) {
				for (int j = 0; j < W; j++) {
					if (col[j]) {
						System.out.print(a[i].charAt(j));
					}
				}
				System.out.println();
			}
		}

	}
}
