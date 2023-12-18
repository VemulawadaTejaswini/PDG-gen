import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String S = scan.nextLine();
		int ans = 0;
		String tmpS;

		boolean exist = true;
		for (int i = 0; i + ans <= S.length(); i++) {
			while (exist) {
				if (i + ans + 1 > S.length()) {
					break;
				}
				tmpS = S.substring(i, i + ans + 1);
				if (i + ans + 1 + tmpS.length() > S.length()) {
					break;
				}
				for (int j = i + ans + 1; j + tmpS.length() <= S.length(); j++) {
					String wkS = S.substring(j, j + tmpS.length());
					if (tmpS.equals(wkS)) {
						ans = Math.max(ans, tmpS.length());
						exist = true;
						break;
					}
					else {
						exist = false;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
