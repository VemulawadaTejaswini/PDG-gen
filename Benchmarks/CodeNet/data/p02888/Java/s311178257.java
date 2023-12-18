import java.util.*;

public class Answer {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		sc.close();
		// 配列のソート
		Arrays.sort(L);

		int ans = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				int l = j;
				int r = N;
				while(r - l > 1) {
					int m = (l + r) / 2;
					if (L[i] + L[j] > L[m]) {
						l = m;
					} else {
						r = m;
					}
				}
				ans += l - j;
			}
		}
		System.out.println(ans);
	}
}
