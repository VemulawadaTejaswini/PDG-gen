import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		double min = Double.MAX_VALUE;
		int minPotision = 0;
		for (int i = 0; i < N; i++) {
			if (Math.abs(T - H[i] * 0.006 - A) < min) {
				min = Math.abs(T - H[i] * 0.006 - A);
				minPotision = i;
			}
		}
		System.out.print(minPotision + 1);
	}
}