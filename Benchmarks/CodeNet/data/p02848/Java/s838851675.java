import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char si = s.charAt(i);
			for (int j = 0; j < a.length(); j++) {
				char aj = a.charAt(j);
				if (si == aj) {
					String sa = String.valueOf(a.charAt(j + n));
					ans.append(sa);
					break;
				}

			}
		}

		System.out.println(ans);


	}
}
