import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		Set<Character> set = new HashSet<>();
		for (int i = 0;i < k;i++) {
			set.add(sc.next().charAt(0));
		}
		for (int i = n;i < 100000;i++) {
			String s = String.valueOf(i);
			boolean b = true;
			for (int j = 0;j < s.length();j++) {
				if (set.contains(s.charAt(j))) b = false;
			}
			if (b) {
				System.out.println(i);
				return;
			}
		}
	}
}
