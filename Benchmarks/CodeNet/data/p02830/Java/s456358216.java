import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		int i = 0;
		while (N >= i + 1) {

			System.out.print(S.substring(i, i + 1) + T.substring(i, i + 1));
			i++;
		}
		sc.close();
	}

}
