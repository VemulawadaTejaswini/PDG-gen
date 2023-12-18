import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(scanner.nextInt());
		}

		int cnt = 0;
		for (int a : set) {
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
