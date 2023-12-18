import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int K = reader.nextInt();
		int ans = 1;
		for (int i = 0; i<N;i++) {
			if (ans < K) {
				ans *= 2;
			} else {
				ans += K;
			}
		}

		System.out.print(ans);
		reader.close();
	}
}



