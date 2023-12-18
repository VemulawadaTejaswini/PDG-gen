import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int p[] = new int [N];
		for (int i = 0; i < N; i++) {
			// 配列のインデックス用に調整
			p[i] = sc.nextInt() - 1;
		}
		
		long a[] = new long[N];
		long b[] = new long[N];
		
		// 初期値の設定
		for (int i = 0; i < N; i++) {
			a[i] = i + 1;
			b[i] = N - i;
		}
		
		for (int i = 0; i < N - 1; i++) {
			if (p[i] < p[i + 1]) {
				a[p[i + 1]] = a[p[i + 1]] + (i + 1);
			} else {
				b[p[i + 1]] = b[p[i + 1]] + (i + 1);
			}
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