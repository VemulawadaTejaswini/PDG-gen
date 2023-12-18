import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// diの入力
		int[] d = new int[N];
		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		
		// 回復量の総和の計算
		int sum = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				sum += d[i] * d[j];
			}
		}
		
		// 結果の出力
		System.out.println(sum);
		
		sc.close();
	}

}
