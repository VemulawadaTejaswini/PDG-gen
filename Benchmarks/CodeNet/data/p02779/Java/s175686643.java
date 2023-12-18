import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			Integer tmp = sc.nextInt();
			if (a.contains(tmp)) {
				flag = true;
			}
			a.add(tmp);
		}
		if (flag) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
