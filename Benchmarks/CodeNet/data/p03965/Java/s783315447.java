import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int g = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'g') {
				g++;
			}
		}
		int p = s.length() - g;

		if (p < g) {
			System.out.println((g - p) / 2);
		} else {
			System.out.println(0);
		}
	}
}
