import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		int n = sc.nextInt();
		List<Integer> list = new LinkedList<Integer>();

		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if (i % 2 != 0) {
					list.add(0, a);
				} else {
					list.add(a);
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if (i % 2 == 0) {
					list.add(0, a);
				} else {
					list.add(a);
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i : list) {
			sb.append(i);
			sb.append(" ");
		}
		System.out.println(sb.substring(0, sb.length() - 1));
	}
}
