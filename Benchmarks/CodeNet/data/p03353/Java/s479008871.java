import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		Set<String> subs = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < i + 1 + k && j <= s.length(); j++) {
				subs.add(s.substring(i, j));
			}
		}
		List<String> sublist = new ArrayList<>(subs);
		Collections.sort(sublist);
		System.out.println(sublist.get(k - 1));

	}
}
