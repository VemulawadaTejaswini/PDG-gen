import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int[][][] A = new int[4][3][10];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();

			A[b-1][f-1][r-1] += v;
			//System.out.println(A[b][f][r]);
		}


		for (int i = 0; i < 4; i++){
			if(i > 0)
				System.out.println("####################");

			for (int j = 0; j < 3; j++){

				for(int k = 0;k < 10;k++){


					System.out.print(" " + A[i][j][k]);

				}
				System.out.println();

			}


		}



	}
}