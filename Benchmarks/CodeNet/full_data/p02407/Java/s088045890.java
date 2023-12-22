import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num <= 100) {
			int array[] = new int[num];
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < array.length; i++) {
				int next = scanner.nextInt();
				if (0 <= next && next < 1000) {
					list.add(next);
				}
			}
			Collections.reverse(list);

			for (int i = 0; i < list.size(); i++) {
				if (i == (list.size()-1)) {
					System.out.println(list.get(i));
				} else {
					System.out.print(list.get(i) + " ");
				}
			}
		}
	}
}