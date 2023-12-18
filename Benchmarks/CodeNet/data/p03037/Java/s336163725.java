import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		List<Integer> l = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			l.add(sc.nextInt());
			r.add(sc.nextInt());
		}
		for (int i = 1; i <= n; i++) {
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				if (!(l.get(j) <= i && r.get(j) >= i)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				++count;
			}
		}
		System.out.println(count);
	}
}
