import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T[] = new int[N];
		int A[] = new int[N];
		int max = 0;
		long ans = 1;
		int A_pos = 0;

		int T_max = 0;
		int A_min = 0;


		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
			max = Math.max(max, T[i]);
			A_min = Math.max(max, T[i]);
		}
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (max != A[i] && A_pos == 0) {
				A_pos = i - 1;
			}
		}

		if (T[N-1] != A[0]) {
			System.out.println("0");
			System.exit(0);
		}

		if (T[0] != A[0] && N > 1 && A[0] != A[1]) {
			System.out.println("0");
			System.exit(0);
		}

		if (T[0] != A[0] && N == 1) {
			System.out.println("0");
			System.exit(0);
		}

		if (N > 1) {
			if (T[N-1] != A[N-1] && T[N-1] != T[N-2]) {
				System.out.println("0");
				System.exit(0);
			}
		}

		T_max = T[0];
		A_min = A[N-1];

		int t_flag = 0;
		int a_flag = 0;

		for (int i = 1; i < N - 1; i++) {

//			if (T[i] == max && t_flag ==0) {
//				t_flag = 1;
//				if (A_pos == i){
//					a_flag=1;
//				}
//				continue;
//			}

			if (T_max < T[i]){
				T_max = T[i];
				if (A_min > A[i+1]) {
					A_min = A[i+1];
				}
				continue;
			}

//			if (A_pos == i) {
//				a_flag = 1;
//				continue;
//			}

			if (A_min > A[i+1]) {
				A_min = A[i+1];
				continue;
			}
			int min = Math.min(T[i], A[i]);
			ans = (ans * min)%1000000007;
		}

		System.out.println(ans);
		sc.close();
	}

}
