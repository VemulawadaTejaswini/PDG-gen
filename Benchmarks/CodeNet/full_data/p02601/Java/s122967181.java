import java.util.Scanner;

// m_solutions2020_a
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		boolean result = recursion(A, B, C, K);

		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

	private static boolean recursion(int red, int green, int blue, int K) {

		if (K == -1) {
			return false;
		}

		if (red < green && green < blue) {
			return true;
		}

		boolean bl1 = recursion(red * 2, green, blue, K - 1);
		boolean bl2 = recursion(red, green * 2, blue, K - 1);
		boolean bl3 = recursion(red, green, blue * 2, K - 1);

		return bl1 || bl2 || bl3;
	}
}
