import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] A = new int[2][N];
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < N ; j++){
				A[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int ans = 0;
		int tmp = 0;
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j <=i ; j++){
				tmp += A[0][j];
			}
			for(int k = i ; k < N ; k++){
				tmp += A[1][k];
			}

			ans = Math.max(ans, tmp);

			tmp = 0;
		}

		System.out.println(ans);


	}
}
