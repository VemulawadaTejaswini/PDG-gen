import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		boolean hasNext;
		String[] param = new String[10];
		do {
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				String name = in.next();
				int point = in.nextInt() * 3;
				in.next();
				point += in.nextInt();
				param[i] = String.format("%1$02d%2$02d%3$s,%4$d", 30 - point,
						i, name, point);
			}
			Arrays.sort(param, 0, n);
			for (int i = 0; i < n; i++) {
				System.out.println(param[i].substring(4));
			}
			if (hasNext = in.hasNext()) {
				System.out.println();
			}
		} while (hasNext);
	}
}