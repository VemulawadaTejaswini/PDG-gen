import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Long> list = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 9; i++) {
			dfs(i);
		}
		Collections.sort(list);
		System.out.println(list.get(k - 1));
	}

	static void dfs(long x) {
		if (x > 3234566667L) {
			return;
		}
		list.add(x);
		if (x % 10 > 0) {
			dfs(x * 10 + x % 10 - 1);
		}
		dfs(x * 10 + x % 10);
		if (x % 10 < 9) {
			dfs(x * 10 + x % 10 + 1);
		}
	}
}
