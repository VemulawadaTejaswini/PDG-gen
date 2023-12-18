import java.util.Scanner;

/**
 * https://abc044.contest.atcoder.jp/tasks/abc044_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		
		long ans = Math.min(K,N)*X + Math.max(0, N-K)*Y;
		System.out.println(ans);

	}

}