import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		if (A + B >= K && A + B + C <= K) {
			System.out.println(1 * A);
		} else if (A + B + C >= K) {
			System.out.println(1 * A + (A + B + C - K) * -1);
		}
		sc.close();
	}
}
