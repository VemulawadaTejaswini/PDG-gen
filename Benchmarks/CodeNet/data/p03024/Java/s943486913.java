import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		sc.close();

		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'o') {
				cnt++;
			}
		}
		if (cnt + 15 - ch.length >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
