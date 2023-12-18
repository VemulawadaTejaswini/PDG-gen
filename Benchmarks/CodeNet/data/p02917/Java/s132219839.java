import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		//int[] a = new int[n];
		int[] b = new int[n - 1];

		for (int i = 0; i < n - 1; i++) {
			b[i] = sc.nextInt();
		}
		answer += b[n - 2];
		for (int i = n - 2; i > 0; i--) {
			answer += Math.min(b[i - 1], b[i]);
		}

		answer += b[0];
		System.out.println(answer);
	}
}
