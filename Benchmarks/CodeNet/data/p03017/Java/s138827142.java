import java.util.Scanner;

//AtCoder Grand Contest 034
//A	Kenken Race
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();

		sc.close();

		if (S.substring(A - 1, C).matches(".*#{2}.*")) {
			System.out.println("No");
			return;
		}

		if (S.substring(B - 1, D).matches(".*#{2}.*")) {
			System.out.println("No");
			return;
		}

		if (C < D) {
			System.out.println("Yes");
			return;
		}

		if (S.substring(B - 1, D).matches(".*\\.{3}.*")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
