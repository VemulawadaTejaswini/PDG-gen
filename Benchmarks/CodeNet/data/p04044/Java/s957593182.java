import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			new Main().exec(sc);
		}
	}

	public void exec(Scanner sc) {
		int n = sc.nextInt();
		int l = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		Collections.sort(list);
		System.out.println(String.join("", list));
	}
}
