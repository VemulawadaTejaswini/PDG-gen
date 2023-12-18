import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int START = input.nextInt();
		int C1 = 0;
		int C2 = 0;
		int[] toll = new int[M];
		for (int i = 0; i < M; i++) {
			toll[i] = input.nextInt();
		}
		for (int i = START+1; i<=N; i++) {
			for (int check = 0; check < M; check++) {
				if (i==toll[check]) {
					C1++;
					break;
				}
			}
		}
		for (int i = START-1; i>=0; i--) {
			for (int check = 0; check < M; check++) {
				if (i==toll[check]) {
					C2++;
					break;
				}
			}
		}
		System.out.println(Math.min(C1, C2));
	}
}