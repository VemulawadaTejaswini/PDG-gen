import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			if (a % 2 == 0)
				list.add(a);
		}

		int cnt = 0;
		for (int a : list) {
			cnt += calc2Pow(a);
		}

		System.out.println(cnt);

	}

	private static int calc2Pow(int a) {
		int cnt = 0;
		while (a % 2 == 0) {
			a /= 2;
			cnt++;
		}
		return cnt;
	}
}