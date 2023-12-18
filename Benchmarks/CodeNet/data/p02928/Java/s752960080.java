
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		// 1 3 2 1 3 2 1 3 2
		long ret = 0;
		long MOD = 1000000007;
		// 10 9 8 7 5 6 3 4 2 1 10 9 8 7 5 6 3 4 2 1
		// 1 C0
		// 2 C0 * 2 + C1
		// 3 C0 * 3 + C1 * 2
		// K C0 * K + C1 * (K - 1)
		long KS = (K * (1 + K) / 2) % MOD;
		long KS2 = ((K - 1) * (K) / 2) % MOD;
		for(int i = 0 ; i < N ; ++i){
			long C0 = 0;
			long C1 = 0;
			for(int j = 0 ; j < i ; ++j){
				if(A[i] > A[j]){
					++C0;
				}
			}
			for(int j = i + 1 ; j < N ; ++j){
				if(A[i] > A[j]){
					++C1;
				}			
			}
			long add = KS2 * C0 + KS * C1;
			ret = (ret + add) % MOD;
//			System.out.println(C0 + " " + C1 + " " + ret);
		}
		System.out.println(ret);
	}
}
