import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[][] A = new int[N][M];
		int[] B = new int[M];
		int a = 0;
		for(int i=0; i<M; i++) {
			B[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i=0; i<N; i++) {
			int s = 0;
			for(int j=0; j<M; j++) {
				s += A[i][j] * B[j];
			}
			s += C;
			if(s>0) {
				a++;
			}
		}
		System.out.println(a);
	}

}