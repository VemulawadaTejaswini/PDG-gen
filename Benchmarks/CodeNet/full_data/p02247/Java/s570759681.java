import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String T = sc.nextLine();
	static String P = sc.nextLine();
	static char[] t = T.toCharArray();
	static char[] p = P.toCharArray();
	public static void main(String[] args) {
		naiveSearch(t, p);

	}

	private static void naiveSearch(char[] t, char[] p) {
		boolean isSame = true;

		for (int i = 0; i < t.length - p.length + 1; i++) {
			isSame = true;
			for (int j = 0; j < p.length; j++) {

					if (t[i + j] != p[j]) {
						isSame = false;
						break;
					}

			}

				if (isSame == true) {
					System.out.println(i);
				}
		}

	}

}

