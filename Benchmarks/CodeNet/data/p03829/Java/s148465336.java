import java.util.Scanner;

/**
 * https://abc052.contest.atcoder.jp/tasks/arc067_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		long[] x = new long[N];
		for(int i=0; i<N; i++){
			x[i] = Long.parseLong(sc.next());
		}
		sc.close();

		long ans = 0;
		for(int i=1; i<N; i++){
			ans += Math.min((x[i]-x[i-1])*A, B);
		}
		
		System.out.println(ans);
		
	}

}