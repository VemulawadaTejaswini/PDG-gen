import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		if (N == 1) {
			if (M == 1)
				System.out.println(1);
			else
				System.out.println(M - 2);
		}
		else if (M == 1)
			System.out.println(N - 2);
		else
			System.out.println((N - 2) * (M - 2));
	}
}