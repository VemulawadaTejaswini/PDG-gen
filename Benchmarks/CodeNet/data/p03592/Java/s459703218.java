import java.util.*;

// ARC 77-C
// http://arc077.contest.atcoder.jp/tasks/arc077_a

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		int K = in.nextInt();
		
		boolean isPossible = false;
		
		for (int x = 0; x < N && !isPossible; x++) {
			for (int y = 0; y < M && !isPossible; y++) {
				int numBlack = (x * M - x * y) + (y * N - x * y);
				if (numBlack == K) {
					isPossible = true;
				}
			}
		}
		
		System.out.println(isPossible ? "Yes" : "No");
	}
	
}
