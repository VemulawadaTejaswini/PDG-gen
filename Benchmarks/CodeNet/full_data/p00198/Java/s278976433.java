import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int xi[][];
		HashSet<Integer> list = new HashSet<Integer>();

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			xi = new int[n][6];
			list.clear();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 6; j++) {
					String s = sc.next();
					if (s.equals("Red")) {
						xi[i][j] = 1;
					} else if (s.equals("Yellow")) {
						xi[i][j] = 2;
					} else if (s.equals("Blue")) {
						xi[i][j] = 3;
					} else if (s.equals("Magenta")) {
						xi[i][j] = 4;
					} else if (s.equals("Green")) {
						xi[i][j] = 5;
					} else if (s.equals("Cyan")) {
						xi[i][j] = 6;
					}
				}
			}

			int id1 = 0;
			int id2 = 0;
			int id3 = 0;
			int id4 = 0;
			for (int i = 0; i < n; i++) {
				if (xi[i][0] != 1) {
					for (int j = 0; j < 6; j++) {
						if (xi[i][j] == 1) {
							id1 = j;
						}
					}
					if (id1 == 5) {
						id2 = 1;
						id3 = 0;
						id4 = 4;
					} else {
						id2 = 5;
						id3 = 5 - id1;
						id4 = 0;
					}
					while (xi[i][0] != 1) {
						int tmp = xi[i][id1];
						xi[i][id1] = xi[i][id2];
						xi[i][id2] = xi[i][id3];
						xi[i][id3] = xi[i][id4];
						xi[i][id4] = tmp;
					}
				}
				id1 = 1;
				id2 = 2;
				id3 = 4;
				id4 = 3;
				if (xi[i][5] == 2) {
					while (xi[i][1] != 3) {
						int tmp = xi[i][id1];
						xi[i][id1] = xi[i][id2];
						xi[i][id2] = xi[i][id3];
						xi[i][id3] = xi[i][id4];
						xi[i][id4] = tmp;
					}
				} else {
					while (xi[i][1] != 2) {
						int tmp = xi[i][id1];
						xi[i][id1] = xi[i][id2];
						xi[i][id2] = xi[i][id3];
						xi[i][id3] = xi[i][id4];
						xi[i][id4] = tmp;
					}
				}
			}

			for (int i = 0; i < n; i++) {
				int x = 0;
				for (int j = 0; j < 6; j++) {
					x *= 10;
					x += xi[i][j];
				}
				if (!list.contains(x)) {
					list.add(x);
				}
			}

			System.out.println(n - list.size());
		}
	}
}