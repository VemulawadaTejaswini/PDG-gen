import java.util.Scanner;

public class Main {
	public static final char a = 'A';
	public static final char c = 'C';
	public static final char g = 'G';
	public static final char t = 'T';

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		StringBuilder maxSub = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			char SAti = S.charAt(i);
			if (judgeContains(SAti)) {
				StringBuilder subS = new StringBuilder();
				subS = subS.append(SAti);
				for (int j = i+1; j < S.length(); j++) {
					char SAtj = S.charAt(j);
					if (judgeContains(SAtj)) {
						subS = subS.append(SAtj);
						continue;
					}
					break;
				}
				maxSub = subS.length() > maxSub.length() ? subS : maxSub;
			}
		}
		System.out.print(maxSub.length());
		scanner.close();
	}

	public static boolean judgeContains(char chr) {
		if (chr == a || chr == c || chr == g || chr == t) {
			return true;
		}
		return false;
	}
}