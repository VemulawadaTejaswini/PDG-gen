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
		} else if (N == M) {
			flipCard = 0;
		} else {	
			if (N % 2 == 0 && M % 2 == 0) {
				flipCard = N * M - (N * 2 + M * 2 - 4);
			} else {
				flipCard = 0;
			}
		}
		
		System.out.println(flipCard);
	}
}