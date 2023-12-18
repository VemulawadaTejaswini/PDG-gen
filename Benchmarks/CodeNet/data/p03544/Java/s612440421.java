
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		List<Long> list = new ArrayList<>();
		long add = 0;
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				add = 2;
				list.add(add);
				continue;
			}
			if (i == 1) {
				add = 1;
				list.add(add);
				continue;
			}
			add = list.get(i - 2) + list.get(i - 1);
			list.add(add);
		}

		System.out.println(add);
	}

}
