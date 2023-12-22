import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = sc.next();
		for (int i = 1; i < n; i++) {
			String str = sc.next();
			int min = Math.min(ans.length(), str.length());
			for (int j = 0; j < min; i++) {
				if (ans.charAt(j) == str.charAt(j)) {
					if (j + 1 == min && str.length() < ans.length()) {
						ans = str;
					}
					continue;
				}
				if (ans.charAt(j) < str.charAt(j)) {
					break;
				} else {
					ans = str;
					break;
				}
			}
		}
		sc.close();
		System.out.println(ans);
	}

}