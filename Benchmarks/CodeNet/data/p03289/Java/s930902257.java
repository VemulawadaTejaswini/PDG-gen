import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String result = "WA";
		if ('A' == (S.charAt(0)) &&
				(String.valueOf(S.charAt(1)).toLowerCase()).equals(String.valueOf(S.charAt(1))) &&
				(String.valueOf(S.charAt(S.length() - 1))).toLowerCase().equals(String.valueOf(S.charAt(S.length() - 1)))) {
			for (int i = 2; i < S.length(); i++) {
				if ('C' == S.charAt(i)) {
					if ("WA".equals(result)) {
						result = "AC";
					} else {
						result = "WA";
						break;
					}
				} else if (!(String.valueOf(S.charAt(i)).toLowerCase()).equals(String.valueOf(S.charAt(i)))) {
					result = "WA";
					break;
				}
			}
		}
		System.out.println(result);
	}
}
