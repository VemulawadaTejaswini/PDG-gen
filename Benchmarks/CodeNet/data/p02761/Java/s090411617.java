import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N;
		int M;
		int s;
		int c;
		int i;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		M = Integer.parseInt(sc.next());
		int[] X = new int[3];
		Arrays.fill(X, -1);
		for (i = 0; i < M; i++) {
			s = Integer.parseInt(sc.next());
			c = Integer.parseInt(sc.next());
			if (X[s - 1] == -1) {
				X[s - 1] = c;
			} else if (X[s - 1] != c) {
				System.out.println("-1");
				sc.close();
				return;
			}
		}
		sc.close();
		for (i = 0; i < N; i++) {
			if (X[i] != -1 && X[i] != 0) {
				flag = 1;
			} else if (X[i] == 0 && flag == 0) {
				System.out.println("-1");
				return;
			} else if (X[i] == -1 && flag == 1) {
				X[i] = 0;
			}
		}
		for (i = 0; i < N; i++) {
			if (X[i] != -1) {
				System.out.print(X[i]);
			}
		}
	}
}