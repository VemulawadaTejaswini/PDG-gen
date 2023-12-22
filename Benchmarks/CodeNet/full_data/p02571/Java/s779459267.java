import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int min = -1;

		if (S.equals(T)) {
			System.out.println(0);
		}else {
			for (int i = T.length(); i <= S.length(); i++) {
				String string = S.substring(i - T.length(),i);
				int let = 0;
				for (int j = 0; j < T.length(); j++) {
					if (string.charAt(j) == T.charAt(j)) {
						let++;
					}
				}
				min = Math.max(min, let);
			}

			System.out.println(T.length() - min);
		}
	}

}