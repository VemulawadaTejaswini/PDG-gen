import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (i % 2 == 0) {
				if (a % 2 == 1) {
					list.add(a);
				}
			} else {
				continue;
			}
		}
		System.out.println(list.size());
	}
}
