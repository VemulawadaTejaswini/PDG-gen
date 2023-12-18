import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String N = sc.next();
			String[] number = new String[3];
			for (int i = 0; i < 3; i++) {
				number[i] = String.valueOf(N.charAt(i));
			}
			String ans = "No";
			for (int i = 0; i < 3; i++) {
				if (number[i].equals("7")) {
					ans = "Yes";
					break;
				}
			}

			System.out.println(ans);
		} finally

		{
			sc.close();
		}
	}

}
