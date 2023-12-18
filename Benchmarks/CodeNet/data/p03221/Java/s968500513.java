import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[][] P_num = new int[M][N+1];

		int[] PA = new int[M];
		int[] YA = new int[M];

		for(int i = 0;i < M;i++) {
			int P = scn.nextInt();
			int Y = scn.nextInt();
			PA[i] = P;
			YA[i] = Y;
			int[] A = P_num[P];
			for(int j = 0;j < M;j++) {
				if(A[j] == 0) {
					A[j] = Y;
					break;
				}else {
					if(Y < A[j]) {
						int buf = A[j];
						A[j] = Y;
						Y = buf;
					}
				}
			}
		}


		for(int i = 0;i < M;i++) {
			int P = PA[i];
			int Y = YA[i];

			int[] A = P_num[P];
			int z = 0;
			for(int j = 0;j < M;j++) {
				if(A[j] == Y) {
					z = j+1;
					break;
				}
			}


			System.out.println(String.format("%06d", P) + String.format("%06d", z));


		}



	}
}
