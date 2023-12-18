import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		StringBuffer sb = new StringBuffer();
		for(int i = S.length(); i > 0; i--) {
			sb.append(S.charAt(i - 1));
		}
		String R = sb.toString();

		int len = S.length();

		StringBuffer start = new StringBuffer();
		for(int i = 0; i < (len - 1) / 2; i++) {
			start.append(S.charAt(i));
		}
		String str = start.toString();

		StringBuffer end = new StringBuffer();
		for(int i = (len + 3) / 2; i <= len; i++) {
			end.append(S.charAt(i - 1));
		}
		String en = end.toString();


		if(len > 5) {
			if(S.equals(R) && S.substring(0, (len - 1) / 2).equals(str) && S.substring((len + 3) / 2 - 1, len).equals(en)) {
				System.out.println("Yes");
				return;
			}else {
				System.out.println("No");
				return;
			}
		}else if(len == 5) {
			if(S.equals(R) && S.charAt(0) == S.charAt(1) && S.charAt(3) == S.charAt(4)) {
				System.out.println("Yes");
				return;
			}else {
				System.out.println("No");
				return;
			}
		}else {
				System.out.println("Yes");
				return;
		}
	}

}