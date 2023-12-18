import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String S1 = S.substring(N / 2);
		String S2 = S.substring(0, N / 2);
		String S3 = S1 + S2;
		sc.close();
		if (N % 2 == 1) {
			System.out.println("No");
		} else {
			if (S.equals(S3)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}