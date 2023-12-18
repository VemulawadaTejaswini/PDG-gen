import java.util.Scanner;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int M = s.nextInt();
		
		int flipCard = 0;
		
		if (N == 1 || M == 1) {
			flipCard = N * M - 2;
		} else {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (i > 0 && i < N-1 && j > 0 && j < M-1) {
						flipCard++;
					}
				}
			}
			
		}
		System.out.println(flipCard);
	}
}