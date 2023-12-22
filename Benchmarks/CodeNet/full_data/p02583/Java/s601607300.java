import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る

		int[] L = new int[N]; // L[N]を格納する配列

		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt(); // int L[i]を受け取る
		}
		sc.close(); // 標準入力を終了

		int ans = 0; // 解答の数

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					// L[i],L[j],L[k]が全て異なる値かどうか判定
					if(L[i] != L[j] && L[i] != L[k] && L[j] != L[k]) {
                       // 3辺の長さがL[i],L[j],L[k]の三角形があるかどうか判定
						if(Math.abs(L[i] - L[j]) < L[k] && L[k] < L[i] + L[j]) {ans += 1;}
					}
				}
			}
		}
		System.out.println(ans);
	}
}