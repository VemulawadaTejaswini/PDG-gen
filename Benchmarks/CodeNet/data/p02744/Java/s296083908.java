import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		List<String> abList = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");
		List<List<String>> list = new ArrayList<>();
		list.add(Arrays.asList(""));

		for (int i = 1; i < n + 1; i++) {
			List<String> before = list.get(i - 1);
			List<String> current = new ArrayList<>();
			for (String bf : before) {
				for (int j = 0; j < i - 1; j++) {
					current.add(bf + abList.get(j));
				}
			}
			current.add(before.get(before.size() - 1) + abList.get(i-1));
			list.add(current);

		}
		list.get(n).forEach(System.out::println);
	}
}
