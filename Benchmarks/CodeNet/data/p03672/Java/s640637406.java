import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		for(int i = 2; i < S.length(); i += 2) {
			S = S.substring(0, S.length() - 2);
			int l = S.length();
			String s1 = S.substring(0, l / 2);
			String s2 = S.substring(l / 2, l);
			if(s1.equals(s2)) {
				System.out.println(l);
				System.exit(0);
			}
		}
	}
}