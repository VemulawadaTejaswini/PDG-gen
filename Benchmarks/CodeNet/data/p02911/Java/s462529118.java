
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] m = new int[N];
		for (int i = 0; i < N; i++) {
			m[i] = K;
		}
		for (int i = 0; i < Q; i++) {
			int c = sc.nextInt();
			m[c - 1]++;
		}
		for (int i = 0; i < m.length; i++) {
			System.out.println((m[i] - Q) > 0 ? "Yes" : "No");
		}
		sc.close();
	}
}