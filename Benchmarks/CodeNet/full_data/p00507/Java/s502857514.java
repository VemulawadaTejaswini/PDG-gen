
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = Math.min(n, 4);
		int[] num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = scanner.nextInt();
		Arrays.sort(num);
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < a; i++)
			for (int j = 0; j < a; j++) {
				if (i == j)
					continue;
				ans.add(Integer.valueOf(String.valueOf(num[i])
						+ String.valueOf(num[j])));
			}
		Collections.sort(ans);
		System.out.println(ans.get(2));

	}
}