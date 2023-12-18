import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[2][N];

		for(int j=0; j<2; j++) {
			for(int i=0; i<N; i++) {
				A[j][i] = sc.nextInt();
			}
		}

		int[] sum = new int[N];
		for(int k=0; k<N; k++) {
			for(int l=0; l<=k; l++) {
				sum[k] += A[0][l];
			}for(int m=N-1; m>=k; m--) {
				sum[k] += A[1][m];
			}
		}Arrays.sort(sum);

		System.out.println(sum[N-1]);

	}

}
