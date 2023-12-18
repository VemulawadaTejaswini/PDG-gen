import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		String ans = "No";

		list.add(a);
		list.add(b);
		list.add(c);
		Collections.sort(list);

		if (list.get(0) + list.get(1) == list.get(2)) {
			ans = "Yes";
		}

		System.out.println(ans);

	}
}
