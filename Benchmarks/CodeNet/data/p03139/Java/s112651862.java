import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int max = Math.min(A, B);
		int min = N - (A + B);

		if (min < 0) {
			min = Math.abs(min);
		} else {
			min = 0;
		}

		System.out.println(max + " " + min);

	}
}