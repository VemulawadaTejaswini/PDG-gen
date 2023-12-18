import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();
		sc.close();

		if (T.substring(0, S.length()).equals(S)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}