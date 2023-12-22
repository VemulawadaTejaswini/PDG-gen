import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] init = new int[] { a, b, c };

		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		List<String> result = new ArrayList<>();
		dfs(result, s, 0, n, init);

		if (result.size() == n) {
			System.out.println("Yes");
			for (int i = result.size() - 1; i >= 0; i--) {
				System.out.println(result.get(i));
			}
		} else {
			System.out.println("No");

		}

	}

	private static boolean dfs(List<String> result, String[] s, int i, int n, int[] init) {
		if (i == n)
			return true;

		int l = s[i].charAt(0) - 'A';
		int r = s[i].charAt(1) - 'A';

		if (init[l] == 0 && init[r] == 0) {
			return false;
		}

		if (init[l] != 0) {
			int[] next = Arrays.copyOf(init, init.length);
			next[l]--;
			next[r]++;
			if( dfs(result, s, i + 1, n, next) ) {
				result.add(s[i].substring(0, 1));
				return true;
			}
		}

		if (init[r] != 0) {
			int[] next = Arrays.copyOf(init, init.length);
			next[r]--;
			next[l]++;
			if( dfs(result, s, i + 1, n, next) ) {
				result.add(s[i].substring(1, 2));
				return true;
			}
		}

		return false;
	}

}
