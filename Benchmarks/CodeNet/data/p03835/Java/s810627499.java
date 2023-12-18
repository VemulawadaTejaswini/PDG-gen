import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int K = sc.nextInt();
		int S = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= K; i++) {
			for (int j = 0; j <= K && j + i <= S; j++) {
				for (int k = 0; k <= K && k + j + i <= S; k++) {
					if ((i + j + k) == S) {
						sum++;
					}
				}
			}
		}
		
		System.out.println(sum);

		sc.close();
	}
}
