import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S  = scan.next();
		int N = S.length();
		int f = 0;

		if (N == 3) {
			if (S.charAt(0) == S.charAt(2)) {
			} else {
				f++;
			}

		}

		for (int i = 0; i < N/4; i++) {
			if (S.charAt(i) == S.charAt((N-3)/2-i) && S.charAt((N-3)/2-i) == S.charAt((N+1)/2 + i) && S.charAt((N+1)/2 + i) == S.charAt(N-1-i)) {
			} else {
				f++;
				break;
			}
		}
		if (f == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}