import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); PrintWriter pw = new PrintWriter(System.out);) {
			int N = sc.nextInt();
			int[] C = new int[N];
			int[] S = new int[N];
			int[] F = new int[N];
			for (int i = 0; i < N - 1; i++) {
				C[i] = sc.nextInt();
				S[i] = sc.nextInt();
				F[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				int t = S[i];
				for (int j = i; j < N - 1; j++) {
					if (S[j] > t) {
						t = S[j];
					} else if (t % F[j] > 0) {
						t += F[j] - (t % F[j]);
					}
					t += C[j];
				}
				pw.println(t);
			}
			pw.flush();
		} catch (Exception e) {
		}
	}
}