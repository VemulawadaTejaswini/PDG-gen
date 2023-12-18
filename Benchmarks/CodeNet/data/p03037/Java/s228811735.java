import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int n = s.nextInt();
			final int m = s.nextInt();

			int maxStart = 0;
			int minEnd = n;

			for (int i = 0; i < m; i++) {
				int start = s.nextInt();
				int end = s.nextInt();
				if (start > maxStart) {
					maxStart = start;
				}
				if (end < minEnd) {
					minEnd = end;
				}
			}
			if (minEnd < maxStart) {
				System.out.println(0);
			} else {
				System.out.println(minEnd - maxStart + 1);
			}
		}
	}
}