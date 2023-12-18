
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		HashSet<Character> odd = new HashSet<>();
		HashSet<Character> even = new HashSet<>();
		odd.add('R');
		odd.add('U');
		odd.add('D');
		even.add('L');
		even.add('U');
		even.add('D');

		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				if (!odd.contains(str.charAt(i))) {
					flag = 1;
					break;
				}
			} else {
				if (!even.contains(str.charAt(i))) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 1) {
			System.out.println("NO");
		} else {
			System.out.println("Yes");
		}
	}
}
