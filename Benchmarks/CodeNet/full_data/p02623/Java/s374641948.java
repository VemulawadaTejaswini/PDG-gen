import java.util.Scanner;

public class Main {
	//java11

	static int N, M, ans;
	static long K;
	static int[] A, B;
	static long time;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextLong();

		A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		B = new int[M];
		for(int i=0; i<M; i++) {
			B[i] = sc.nextInt();
		}

		ans = 0;
		time = 0;
		int A_index = 0;
		int B_index = 0;
		Outside:
		for(int i=0; i<N+M; i++) {
			if(A_index == N && B_index == M) {
				break;
			}else if(A_index == N){
				if(time + B[B_index] <= K) {
					time += B[B_index];
					B_index++;
					ans++;
				}else {
					break;
				}
			}else if(B_index == M) {
				if(time + A[A_index] <= K) {
					time += A[A_index];
					A_index++;
					ans++;
				}else {
					break;
				}
			}
			else {
			int judge_n = judge(A_index, B_index);

			switch(judge_n) {
			case 1:
				time += A[A_index];
				A_index++;
				ans++;
				break;
			case -1:
				time += B[B_index];
				B_index++;
				ans++;
				break;
			case 0:
				break Outside;
			default:
				break;
			}
			}

		}

		System.out.println(ans);
	}


	//Aを消すべき1, Bを消すべき-1, 消えないは0
	public static int judge(int ai, int bi) {
		if(A[ai] < B[bi]) {
			if(time + A[ai] <= K) {
				return 1;
			}else {
				return 0;
			}
		}
		else if(A[ai] > B[bi]) {
			if(time + B[bi] <= K) {
				return -1;
			}else {
				return 0;
			}
		}else {
			//終了条件
			if(ai == N-1 || bi == M-1) {
				if(time + A[ai] <= K) {
					return 1;
				}else {
					return 0;
				}
			}else {
				return judge(ai+1, bi+1);
			}
		}
	}
}
