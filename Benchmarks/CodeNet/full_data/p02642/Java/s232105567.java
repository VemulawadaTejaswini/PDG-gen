import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		// for文内での判定で次の数と自分が同じかの比較があるので
		// 範囲外の値（ソート後に最大値になるように）を入れておく
		A[N] = 1000001; 
		
		Arrays.sort(A);
		boolean[] check = new boolean[1000001]; // 数列に含まれる最大値まで判定用の配列を用意
		Arrays.fill(check, true);
		int ans = 0;
		// 小さい順から、割り切れるか判定していく
		for (int i = 0; i < N; i++) {
			// 数列の次の値が自身と同じではなく、自身の約数が数列に存在していなければ、カウントを増やす
			if (A[i + 1] != A[i] && check[A[i]]) {
				ans++;
			}
			// 自分が割り切ることのできる数（自分の倍数）について、判定用の数列をfalseにする
			for (int j = A[i]; j <= A[N - 1]; j += A[i]) {
				check[j] = false;
			}
		}
		System.out.println(ans);



	}
}

/*　学んだこと
 * 
 *　事前にあり得る範囲の配列を用意しておくことで、２重ループを避けることができる！
 * 
*/
