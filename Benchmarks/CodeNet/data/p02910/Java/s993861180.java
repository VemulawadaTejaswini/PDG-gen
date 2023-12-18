import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String ans = "Yes";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((i % 2 == 0 && c == 'L')
					|| (i % 2 != 0 && c == 'R')) {
				ans = "No";
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
