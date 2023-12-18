import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		Set<String> ans = new HashSet<String>();
		Set<String> x = new HashSet<String>();
		Set<String> y = new HashSet<String>();

		int max = 0;

		for (int i = 1; i < n; i++) {
			for (int ind = 0; ind < n; ind++) {
				if (ind < i) {
					x.add(s[ind] + "");
				} else {
					y.add(s[ind] + "");
				}
			}

			for (String ss : x) {
				if (y.contains(ss))
					ans.add(ss);
			}

			if (max < ans.size())
				max = ans.size();

			ans = new HashSet<String>();
			x = new HashSet<String>();
			y = new HashSet<String>();
		}

		System.out.println(max);

	}
}
