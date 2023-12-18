import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();
		int k = sc.nextInt();
		List<String> list = new ArrayList<>();

		for (int i = 1; i <= k; i++) {
			for (int j = 0; j < n - i + 1; j++) {
				String tmp = s.substring(j, j + i);
				list.add(tmp);
			}
		}

		Collections.sort(list);
		Set<String> set = new LinkedHashSet<String>();
		set.addAll(list);

		String[] array = set.toArray(new String[set.size()]);

		System.out.println(array[k - 1]);

		sc.close();
	}
}
