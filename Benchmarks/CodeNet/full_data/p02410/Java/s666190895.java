

import java.util.Scanner;

public class Main{

	/*
	 * n*m A // A[n][m]
	 *
	 * m*1 b //  b[m*1]
	 *
	 * A+=b = sysout
	 *
	 * A[ni][mj]
	 *
	 * b[mi]
	 */


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ???????????????
		int n = sc.nextInt(); // 3
		int m = sc.nextInt(); // 4

		int [][] vector_A = new int [n][m]; //[3][4]

		int [] vector_B = new int [m*1]; //[4*1]

		//?????±?????\??????
		for (int i = 0; i < n; i++) {
		  /*1201
			0301
			4110*/
			String[] info = sc.nextLine().split(" ");//??????????????????????????¶

//			System.out.println(info[i]);
			for (int j = 0; j < m; j++) {
				vector_A[i][j]=Integer.parseInt(info[i]);//??°??????????????????????????\??????

//				System.out.println(vector_A[i][j]);
			}
		}
		for (int i = 0; i < m; i++) {//1230
			vector_B[i]=sc.nextInt();
//			System.out.println(vector_B[i]);
		}


		int tot = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tot+=vector_A[i][j]*vector_B[j];
				System.out.println(tot);
			}
		}




















	}


}