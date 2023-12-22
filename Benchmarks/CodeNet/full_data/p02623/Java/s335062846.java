import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long limit = sc.nextLong();
		List<Long> a = new ArrayList<>();
		a.add(0L);
		for (int i = 0; i < n; i++) {
			a.add(a.get(i) + sc.nextLong());
		}
		List<Long> b = new ArrayList<>();
		b.add(0L);
		for (int i = 0; i < m; i++) {
			b.add(b.get(i) + sc.nextLong());
		}
		sc.close();

		int ans = 0;
		int j = m;
		for (int i = 0; i < n + 1; i++) {
			Long ai = a.get(i);
			if (ai > limit) {
				break;
			}
			while (b.get(j) > limit - ai) {
				j--;
			}
			ans = Math.max(ans, j + i);
		}
		System.out.println(ans);
	}
}
