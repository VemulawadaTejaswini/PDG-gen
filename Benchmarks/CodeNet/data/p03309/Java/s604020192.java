import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int ans = 0;
		boolean plus = false;
		boolean minus = false;
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (A-(i+1)<=0) {
				minus = true;
			} else {
				plus = true;
			}
			a[i] = Math.abs(A - (i +1));
			ans += a[i];
		}
		if (!(minus&&!plus)) {
			System.out.println(ans);
			return;
		}
		System.out.println(ans);
		while (true) {
			int ans2 = 0;
			for (int i = 0; i < N; i++) {
				a[i] = Math.abs(a[i]-1);
				ans2 += a[i];
			}
			if (ans < ans2){
				break;
			} else {
				ans = ans2;
			}
		}
		System.out.println(ans);
	}
}
