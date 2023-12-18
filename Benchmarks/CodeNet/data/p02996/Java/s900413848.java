import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		TreeMap<Integer, Integer> s = new TreeMap<Integer, Integer>();
		int sum = 0;
		String ans = "Yes";

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (s.get(b) != null) {
				s.put(b, s.get(b) + a);
			} else {
				s.put(b, a);
			}
		}

		for (int i : s.keySet()) {
			if (sum + s.get(i) <= i) {
				sum += s.get(i);
			} else {
				ans = "No";
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
