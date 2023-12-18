import java.util.Scanner;

//M-SOLUTIONS プロコンオープン
//A - Security
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		char pre = ' ';
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == pre) {
				System.out.println("Good");
				return;
			}
			pre = S.charAt(i);
		}

		System.out.println("Bad");

	}
}
