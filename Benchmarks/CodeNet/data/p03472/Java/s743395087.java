import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 172_D
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		Long H = sc.nextLong();
		Long[] A = new Long[N];
		Long[] B = new Long[N];

		int i = 0;

		for (i=0; i<N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		// Scannerクラスのインスタンスをクローズ
		sc.close();

		// Aを降順ソート
		Arrays.sort(A, Collections.reverseOrder());
		// Bを降順ソート
		Arrays.sort(B, Collections.reverseOrder());

		int attack = 0;

		for(i=0; i<N; i++) {

			if(B[i]<=A[0]) {
				break;
			}

			attack++;
			H -= B[i];
			if(H <= 0) {
				break;
			}
		}

		if(H > 0) {
			attack += H/A[0];
			if(H%A[0] != 0) {
				attack++;
			}
		}

		System.out.println(attack);

	}

}
