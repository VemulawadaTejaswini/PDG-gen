import java.util.Scanner;

//AtCoder Grand Contest 034
//B	ABC
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		sc.close();

		int ans = 0;

		int Acount = 0;
		boolean preA = false;
		boolean preAB = false;

		int len = S.length();

		for (int i = 0; i < len; i++) {
			switch (S.charAt(i)) {
			case 'A':
				preA = true;
				preAB = false;
				Acount++;
				break;

			case 'B':
				if (preA) {
					preAB = true;
				} else {
					Acount = 0;
				}
				preA = false;
				break;

			case 'C':
				if (preAB) {
					ans += Acount;
					preA = true;
					preAB = false;
				} else {
					preA = false;
					Acount = 0;
				}
				preAB = false;
				break;

			default:
				break;
			}
		}

		System.out.println(ans);
	}
}
