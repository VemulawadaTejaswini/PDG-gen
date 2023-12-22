import java.util.Scanner;

/**
 * ソーシャルゲーム (Social Game)
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		int ans = 0;
		int bonus = 0;

		while (C > 0) {
			C -= A;
			ans++;
			bonus++;
			if (bonus == 7) {
				C -= B;
				bonus = 0;
			}
		}

		System.out.println(ans);
	}
}
