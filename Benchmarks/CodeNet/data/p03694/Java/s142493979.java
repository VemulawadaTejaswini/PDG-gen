import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			set.add(scanner.nextInt());
		}
		List<Integer> list = new ArrayList<>(set);
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				continue;
			}
			count += list.get(i) - list.get(i-1);
		}
		System.out.println(count);

	}

}