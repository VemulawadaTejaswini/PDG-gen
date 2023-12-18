import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int answer = 0;

		answer = C - (A - B);

		if (answer < 0) {
			System.out.println(0);
		} else {
			System.out.println(answer);
		}
	}
}
