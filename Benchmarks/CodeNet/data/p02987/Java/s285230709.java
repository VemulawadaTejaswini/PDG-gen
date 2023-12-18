import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = 0;
		for (int i = 0; i < 4; i++) {
			if (s.charAt(0) == s.charAt(i)) {
				a += 1;
			}
		}
		if (a == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}