import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		int[][] map = new int[h][w];

		List<String> ans = new ArrayList<>();

		boolean isBeforeOneEven = true;
		boolean isBeforeRowEven = true;

		boolean isLast = false;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {

				int tmp = sc.nextInt();

				map[i][j] = tmp;

				// System.out.println("tmp: " + tmp);

				if (!isBeforeOneEven)
					tmp++;

				if (j + 1 == w) {
					isLast = true;
					if (!isBeforeRowEven)
						tmp++;
				}

				if (tmp % 2 == 0) {
					// System.out.println("even: " + tmp);
					isBeforeOneEven = true;
				} else {

					if (j + 1 == w) {
						if (i + 1 == h) {
							// System.out.println("last");
						} else {
							String str = (i + 1) + " " + (j + 1) + " " + (i + 2) + " " + (j + 1);
							ans.add(str);
							// System.out.println("odd end: " + str);
						}
					} else {
						String str = (i + 1) + " " + (j + 1) + " " + (i + 1) + " " + (j + 2);
						ans.add(str);
						// System.out.println("odd not end: " + str);
					}

					isBeforeOneEven = false;
				}
				if (isLast) {
					isBeforeRowEven = isBeforeOneEven;
					isBeforeOneEven = true;
					isLast = false;
				}
			}
		}

		Integer size = ans.size();
		ans.add(0, size.toString());

		ans.forEach(s -> System.out.println(s));
	}
}
