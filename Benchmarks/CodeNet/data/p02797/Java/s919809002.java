import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		String noMatch = String.valueOf(Integer.MAX_VALUE);
		String just = String.valueOf(s);
		List<String> list = new ArrayList<>();
		if (k == 0) {
			for (int i = 0; i < n; i++) {
				list.add(just);
			}
		} else if (k < n) {
			for (int i = 0; i < k; i++) {
				list.add(just);
			}
			for (int i = 0; i < n - k; i++) {
				list.add(noMatch);
			}
		} else if (k == n) {
			for (int i = 0; i < k; i++) {
				list.add(just);
			}
		}
		System.out.println(String.join(" ", list));
	}
}
