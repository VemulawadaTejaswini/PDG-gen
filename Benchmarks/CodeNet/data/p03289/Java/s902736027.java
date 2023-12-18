import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		char c[] = S.toCharArray();
		Set<Integer> se = new HashSet<Integer>();

		if (c[0] != 'A') {
			System.out.println("WA");
			return;
		}

		for (int i = 2; i < S.length() - 1; i++) {
			if (c[i] == 'C') {
				if (se.contains(1)) {
					System.out.println("WA");
					return;
				} else {
					se.add(1);
				}
			}
		}
		if(se.isEmpty()) {
			System.out.println("WA");
			return;
		}

		int a = 0;
		for (int i = 0; i < S.length(); i++) {
			if (Character.isUpperCase(c[i])) {
				a++;
			}
		}

		if (a != 2) {
			System.out.println("WA");
		} else {
			System.out.println("AC");
		}
	}
}
