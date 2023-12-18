import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new java.util.Scanner(System.in);
		int N = sc1.nextInt();
		int K = sc1.nextInt();

		if (N % K == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
