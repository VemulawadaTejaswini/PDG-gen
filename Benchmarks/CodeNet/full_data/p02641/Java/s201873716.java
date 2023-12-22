import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println(x);
			System.exit(0);
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		boolean bool = true;
		int i = 0;
		while (bool) {
			if (!list.contains(x - i)) {
				bool = false;
				System.out.println(x - i);
				break;
			}
			if (!list.contains(x + i)) {
				bool = false;
				System.out.println(x + i);
				break;
			}
			i++;
		}
	}
}