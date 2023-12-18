import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int a[] = new int[N + 2];
		a[0] = 0;
		a[N + 1] = 0;
		for(int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < N + 1; i++) {
			sum += Math.abs(a[i + 1] - a[i]);
		}
		
		for(int i = 1; i < N + 1; i++) {
			int route1 = Math.abs(a[i] - a[i - 1]);
			int route2 = Math.abs(a[i + 1] - a[i]);
			int route3 = Math.abs(a[i + 1] - a[i - 1]);
			System.out.println(sum - route1 - route2 + route3);
		}
	}
}
