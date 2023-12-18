import java.util.*;

public class Main {
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
				for (int k = j + 1; k < N; k++) {
					if (L[i] + L[j] > L[k]) {
						ans++;
					} else {
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
