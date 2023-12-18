import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			a[i] = A - (i +1);
		}
		
		Arrays.sort(a);
		
		int center = 0;
		if (N % 2 == 0) {
			center = a[(N/2)-1];
		} else {
			center = a[((N+1)/2)-1];
		}
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.abs(a[i]-center);
		}
		
		System.out.println(ans);
	}
}
