import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int a = m / n;
		int b = (int) Math.sqrt(m);
		int ans = 1;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 1; i <= a && i <= b; i++) {
			if (m % i == 0) {
				ans = i;
				set.add(i);
			}
		}
		for (int i : set) {
			int c = m / i;
			if (c <= a) {
				ans = Math.max(ans, c);
			}
		}
		System.out.println(ans);
	}
}
