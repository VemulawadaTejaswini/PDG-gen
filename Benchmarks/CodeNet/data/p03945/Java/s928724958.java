
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);

		String[] S = sc.nextLine().split("");

		int ans = 0;

		int i = 0;
		for (int j = 1; j < S.length; j++) {
			if (!S[i].equals(S[j])) {
				ans++;
			}
			i++;
		}

		System.out.print(ans);
	}

}