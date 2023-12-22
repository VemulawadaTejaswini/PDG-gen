import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String S;
		String T;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		T = sc.next();
		if (S.length() < 1 || S.length() > 10 || T.startsWith(S) == false || S.length() + 1 != T.length()) {
			System.out.println("No");
		} else
			System.out.println("Yes");
	}
}