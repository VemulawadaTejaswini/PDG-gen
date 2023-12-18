import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int ans = 0;
		for (int i = 0; i <= K; i++) {
			for (int j = 0; j <= K; j++) {
				for (int j2 = 0; j2 <= K; j2++) {
					int sum = i + j + j2;
					if (sum == S) {
						ans++;
					}
					if (sum >= S) {
						break;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}