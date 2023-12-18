import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int K = reader.nextInt();
		int[] X = new int[N];
		int ans = 0;
		for (int i=0; i<N; i++) {
			X[i] = reader.nextInt();
			if (X[i] > K/2) {
				ans += (K-X[i])*2;
			} else {
				ans += X[i]*2;
			}
		}

		System.out.println(ans);
		reader.close();

	}
}



