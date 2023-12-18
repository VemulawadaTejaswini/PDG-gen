import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] a = new String[N+1];
		String[] b = new String[M+1];
		String ans = "No";

		for (int i = 0; i <= N; i++) {
			a[i] = sc.nextLine();
		}

		for (int i = 0; i < M; i++) {
			b[i] = sc.nextLine();
		}

		// 行毎に
		loop1:
		for (int i = 1; i <= N - M; i++) {
			// 左から一文字ずつ
			for (int j = 0; j <= N - M; j++) {
				// System.out.println("i:"+i+" a[i]:"+a[i]+" j:"+j+" a:"+a[i].substring(j, j + M)+" b:"+b[0]);
				if (a[i].substring(j, j + M).equals(b[0])) {
					// 一致したら下の行も確認
					for (int k = 1; k <= M; k++) {
						if (a[i + k].substring(j, j + M).equals(b[k])) {
							ans = "Yes";
							break loop1;
						}
					}
				}
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}
