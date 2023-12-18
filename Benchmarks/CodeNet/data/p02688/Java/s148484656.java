
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		int ans = 0;

		int number[] = new int[N];

		for (int i = 0; i < N; i++) {
			number[i] = 0;
		}

		for (int i = 0; i < K; i++) {
			int d = scan.nextInt();
			for(int j =0;j<d;j++) {
				number[scan.nextInt()-1]++;
			}
		}


		for (int i = 0; i < N; i++) {
			if (number[i] == 0) {
				ans++;
			}
		}
		System.out.println(ans);
		scan.close();
	}
}
