import java.util.Scanner;

//AtCoder Grand Contest 034
//B	ABC
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		sc.close();

		int ans = 0;

		S = S.replaceAll("BC", "D");

		int countA = 0;

		for (int i = 0; i < S.length(); i++) {
			switch (S.charAt(i)) {
			case 'A':
				countA++;
				break;

			case 'D':
				ans += countA;
				break;

			default:
				countA = 0;
				break;
			}
		}

		System.out.println(ans);
	}
}
