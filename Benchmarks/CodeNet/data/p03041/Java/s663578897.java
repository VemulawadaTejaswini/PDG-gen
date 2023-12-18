import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		char[] x = new char[N];
		for (int i = 0; i < N; i++) {
			if (i == K - 1) {
				char a = S.charAt(i);
				x[i] = Character.toLowerCase(a);
			} else {
				x[i] = S.charAt(i);
			}
		}

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
	}

}