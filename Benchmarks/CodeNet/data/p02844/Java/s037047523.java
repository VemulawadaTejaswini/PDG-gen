import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		Set<String> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				for (int k = j + 1; k < s.length(); k++) {
					set.add(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(j)) + String.valueOf(s.charAt(k)));
				}
			}
		}

		System.out.println(set.size());

		sc.close();
	}
}