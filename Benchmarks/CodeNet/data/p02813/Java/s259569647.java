import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int len = sc.nextInt();
			Set<Integer> set = new HashSet<>(len);
			for (int i = 1; i <= len; i++) {
				set.add(i);
			}
			int a = 1;
			for (int i = 1; i < len; i++) {
				int next = sc.nextInt();
				a += factorial(len - i) * count(set, next) - 1;
				set.remove(next);
			}
			sc.nextInt();
			set = new HashSet<>(len);
			for (int i = 1; i <= len; i++) {
				set.add(i);
			}
			int b = 1;
			for (int i = 1; i < len; i++) {
				int next = sc.nextInt();
				b += factorial(len - i) * count(set, next) - 1;
				set.remove(next);
			}
			System.out.print(Math.abs(b - a));
		}
	}

	private static int count(Set<Integer> set, int num) {
		int ans = 0;
		for (int i = 1; i <= num; i++) {
			if (set.contains(i)) {
				ans++;
			}
		}
		return ans;
	}

	private static int factorial(int num) {
		int ans = 1;
		for (int i = num; i >= 1; i--) {
			ans *= i;
		}
		return ans;
	}
}
