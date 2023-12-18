import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		String S = sc.next();
		
		int count = 0;
		for (int i = 1; i <= N-2; i++) {
			for (int j = i+1; j <= N-1; j++) {
				if (S.charAt(i-1) == S.charAt(j-1)) {
					continue;
				}
				for (int k = j+1; k <= N; k++) {
					if (j-i == k-j) {
						continue;
					}
					if (S.charAt(j-1) == S.charAt(k-1)) {
						continue;
					}
					if (S.charAt(i-1) == S.charAt(k-1)) {
						continue;
					}
					//System.out.println(i + ", " + j + ", " + k);
					count++;
				}
			}
		}
		// 結果の出力
		System.out.println(count);

		sc.close();
	}
}
