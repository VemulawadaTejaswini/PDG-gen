import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		Integer[] votes = new Integer[N];
		for (int i = 0; i < N; i++) {
			votes[i] = sc.nextInt();
		}
		
		Arrays.sort(votes, Comparator.reverseOrder());
		
		int totalScores = 0;
		for (int i = 0; i < N; i++) {
			totalScores += votes[i];
		}
		
		for (int i = 0; i < M; i++) {
			if (votes[i] * 4 * M < totalScores) {
				System.out.println("no");
				return;			
			}
		}
		
		System.out.println("yes");

	}
}