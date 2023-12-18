

import java.util.Scanner;

public class Main {
	private static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		System.out.println(count753(N,""));

	}

	private static int count753(int N, String str) {
		long strNum = 0;
		if(!str.equals("")) {
			strNum = Long.parseLong(str);
		}
		if (strNum <= N) {
			if (is753(str)) {
				count++;
			}
			count753(N,str+"3");
			count753(N,str+"5");
			count753(N,str+"7");
		}
		return count;
	}

	private static boolean is753(String str) {
		boolean has7 = false;
		boolean has5 = false;
		boolean has3 = false;
		boolean hasAnother = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '7') {
				has7 = true;
			} else if (str.charAt(i) == '5') {
				has5 = true;
			} else if (str.charAt(i) == '3') {
				has3 = true;
			} else {
				hasAnother = true;
				break;
			}
		}
		if (hasAnother) {
			return false;
		}
		return has7 && has5 && has3;
	}
}
