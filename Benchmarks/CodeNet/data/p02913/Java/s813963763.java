import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String S = scan.nextLine();
		// 半分で分ける
		int ans = 0;
		String tmpS;
		int index;
		int max = S.length() / 2 + 1;
		for (int i = 0; i < S.length(); i++) {
			tmpS = String.valueOf(S.charAt(i));
			index = S.indexOf(tmpS, i + 1 + tmpS.length());
			if (index >= 0) {
				for (int j = i + 1; j < S.length(); j++) {
					tmpS = S.substring(i, j + 1);
//					index = S.indexOf(tmpS, i + tmpS.length());
					if (index < 0) {
						ans = Math.max(ans, tmpS.length() - 1);
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
