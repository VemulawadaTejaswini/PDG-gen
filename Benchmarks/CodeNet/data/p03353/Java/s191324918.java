import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int k = in.nextInt();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < i + 1 + k && j <= s.length(); j++) {
				set.add(s.substring(i, j));
			}
		}
		List<String> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list.get(k - 1));
		in.close();
	}
}