import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Set<String> m = new HashSet<>();
		m.add("eraser");
		m.add("dreamer");
		m.add("dream");
		m.add("erase");
		boolean[] a = new boolean[s.length() + 1];
		a[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (!a[j]) continue;
				if (m.contains(s.substring(j, i))) a[i] = true;
			}
		}

		if (a[s.length()]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
