import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]C = new int[N - 1];
		int[]S = new int[N - 1];
		int[]F = new int[N - 1];
		for(int i = 0; i < N - 1; i++) {
			C[i] = sc.nextInt();
			S[i] = sc.nextInt();
			F[i] = sc.nextInt();
		}
		sc.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N - 1; i++) {
			int t = S[i] + C[i];
			for(int j = i + 1; j < N - 1; j++) {
				if(t <= S[j]) {
					t = S[j] + C[j];
				}else {
					int k = (t - S[j] + F[j] - 1) / F[j];
					t = S[j] + k * F[j] + C[j];
				}
			}
			sb.append(t).append("\n");
		}
		sb.append(0);
		System.out.println(sb.toString());
	}
}
