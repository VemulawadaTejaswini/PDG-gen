import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			String[] threads = new String[n];
			for (int i = 0; i < n; i++)
				threads[i] = sc.next();
			int[] depths = new int[n];
			for (int i = 0; i < n; i++) {
				int depth = 0;
				for (int j = 0; j < threads[i].length(); j++) {
					if (threads[i].charAt(j) == '.')
						depth++;
				}
				depths[i] = depth;
			}
			for (int i = 1; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (depths[i] == depths[j]) {
						replace(threads, i, j, depths[i], '|');
						break;
					}
					if (depths[i] > depths[j]) {
						replace(threads, i, j - 1, depths[i], ' ');
						break;
					}
				}
			}
			for (int i = 1; i < n; i++) {
				replace(threads, i, i, depths[i], '+');
			}
			for (int i = 1; i < n; i++)
				for (int j = 0; j < threads[i].length(); j++)
					if (threads[i].charAt(j) == '.')
						replace(threads, i, i, j + 1, ' ');
			for (String thread : threads)
				System.out.println(thread);
		}
		sc.close();
	}

	private static void replace(String[] threads, int x, int y, int depth,
			char dst) {
		for (int i = x; i <= y; i++) {
			StringBuilder sb = new StringBuilder(threads[i]);
			threads[i] = sb.replace(depth-1, depth, Character.toString(dst)).toString();
		}
	}

}