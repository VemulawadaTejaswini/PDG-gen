import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		double ans = (Math.pow(A, 2) - Math.pow(B, 2)) / (2 * (A - B));
		if (ans == (int) ans) {
			System.out.println((int) ans);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

}