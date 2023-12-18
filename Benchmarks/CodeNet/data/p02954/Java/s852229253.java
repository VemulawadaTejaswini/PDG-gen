import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		// System.out.println("S :" + Arrays.toString(S));

		int[] r = new int[S.length];
		char R = 'R', L = 'L';

		// RからLへまでの距離
		int cnt = 0;
		int[] LL = new int[S.length];
		for(int i = 0; i < S.length; i++) {
			if(S[i] == L) LL[i] = ++cnt;
			else cnt = 0;
		}
		// System.out.println("LL:" + Arrays.toString(LL));

		// LからRへまでの距離
		cnt = 0;
		int[] RR = new int[S.length];
		for(int i = S.length - 1; i >= 0; i--) {
			if(S[i] == R) RR[i] = ++cnt;
			else cnt = 0;
		}
		// System.out.println("RR:" + Arrays.toString(RR));

		// 移動距離の計算
		for(int i = 0; i < S.length; i++) {
			if(RR[i] == 0) {
				if(LL[i] % 2 == 0) ++r[i - LL[i]];
				else ++r[i - LL[i] + 1];
			}
			if(LL[i] == 0) {
				if(RR[i] % 2 == 0) ++r[i + RR[i]];
				else ++r[i + RR[i] - 1];
			}
			// System.out.println(i + ":" + Arrays.toString(r));
		}
		// System.out.println("");

		// 結果の出力
		for(int i = 0; i < S.length; i++) {
			System.out.print(r[i] + " ");
		}
		System.out.println("");
	}
}
