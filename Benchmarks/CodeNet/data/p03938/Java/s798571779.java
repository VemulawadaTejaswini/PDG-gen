import java.util.*;
public class pB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int p[] = new int [N];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt() - 1;
		}
		
		int r[] = new int[N];
		for (int i = 0; i < N; i++) {
			r[p[i]] = i + 1;
		}
		
		long a[] = new long[N];
		long b[] = new long[N];
		// 初期値の設定
		for (int i = 0; i < N; i++) {
			a[i] = 25000 * (i + 1);
			b[i] = 25000 * (N - i) + r[p[i]]; 
		}
		
		// 出力
		for (long n : a) {
			System.out.print(n + " ");
		}
		System.out.println("");
		for (long n : b) {
			System.out.print(n + " ");
		}
		
		sc.close();
	}
}