import java.util.Scanner;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();

		int A[][] = new int[N][M];
		int B[][] = new int[M][L];

		String buf_A[] = new String[M];
		String buf_B[] = new String[L];

		for(int row = 0; row < N; row++){
			for(int col = 0; col < M; col++){
				A[row][col] = sc.nextInt();
			}
		}

		for(int row = 0; row < M; row++){
			for(int col = 0; col < L; col++){
				B[row][col] = sc.nextInt();
			}
		}

		Long ans;

		for(int A_row = 0; A_row < N; A_row++){
			for(int B_col = 0; B_col < L; B_col++){
				ans = 0L;
				for(int B_row = 0; B_row < M; B_row++){
					ans += A[A_row][B_row]*B[B_row][B_col];
				}
				if(B_col == 0){
					System.out.printf("%d", ans);
				}else{
					System.out.printf(" %d", ans);
				}
			}
			System.out.printf("\n");
		}
	}
}


