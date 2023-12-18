import java.util.Scanner;

/**
 * https://abc043.contest.atcoder.jp/tasks/arc059_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) a[i] = sc.nextInt();
		sc.close();
		
		int ans = Integer.MAX_VALUE;
		for(int i=-100; i<=100; i++){
			int cost = 0;
			for(int j=0; j<N; j++){
				cost += (i-a[j])*(i-a[j]);
			}
			ans = Math.min(ans, cost);
		}
		
		System.out.println(ans);

	}

}