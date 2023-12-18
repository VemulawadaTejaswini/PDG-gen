import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] T = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			T[i] = reader.nextInt();
			sum += T[i];
		}
		int M = reader.nextInt();
		int[] P = new int[M];
		int[] X = new int[M];
		for (int i = 0; i < M; i++) {
			P[i] = reader.nextInt();
			X[i] = reader.nextInt();
		}
		for (int i = 0; i < M; i++) {
			int ans = sum - ( T[P[i]-1] - X[i]);
			System.out.println(ans);
		}


		reader.close();
	}
}



