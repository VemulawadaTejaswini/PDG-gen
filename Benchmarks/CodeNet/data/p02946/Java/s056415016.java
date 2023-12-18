import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = x; i > x - k; i--) {
			list.add(i);
		}

		for (int i = x + 1; i < x + k; i++) {
			list.add(i);
		}

		Collections.sort(list);
		list.forEach(s -> System.out.print(s + " "));
	}
}