import java.util.Scanner;

/**
 * https://abc048.contest.atcoder.jp/tasks/arc064_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i=0; i<N; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		long ans = 0;
		for(int i=1; i<N; i++){
			if(a[i-1]+a[i]<=x) continue;
			a[i] = Math.max(0, a[i]-x);
			ans += a[i-1]+a[i]-x;
		}
		System.out.println(ans);
	}

}
