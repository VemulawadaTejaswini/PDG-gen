

import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        int numM = sc.nextInt();
        int numL = sc.nextInt();
		/*String tempSize = br.readLine();
		String[] size_In = new String [3];

		size_In=tempSize.split(" ");

		// int numN, numM, numL;
		int numN = Integer.parseInt(size_In[0]); // 3
		int numM = Integer.parseInt(size_In[1]); // 2
		int numL = Integer.parseInt(size_In[2]); // 3
*/
		// insert size;
		int arrA[][] = new int[numN][numM]; // [3][2]
		int arrB[][] = new int[numM][numL]; // [2][3]
		int arrTot[][] = new int[numN][numL];
		//elements of A,B,C is aij, bij, cij;

		/*
		 * arrA[0][0]  arrB [0][1][2]
		 * arrA[1][1]		[0][1][2]
		 * arrA[2][2]
		 */

		for (int i = 0; i < numN; i++) {
			/*String tempInfo = sc.readLine();
			String[] info = tempInfo.split(" ");*/
			for (int j = 0; j < numM; j++) {
				arrA[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < numM; i++) {
			/*String tempInfo = sc.readLine();
			String[] info = tempInfo.split(" ");*/
			for (int j = 0; j < numL; j++) {
				arrB[i][j] = sc.nextInt(); // clear
			}
		}

		// Constrainsts
		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numL; j++) {
				for (int k = 0; k < numM; k++) {
					arrTot[i][j] += arrA[i][k] * arrB[k][j];
				}
			}
		}
		for (int i = 0; i < numN; i++) {
			System.out.print(arrTot[i][0]);
			for (int j = 1; j < numL; j++) {
				System.out.print(" " + arrTot[i][j]);
			}
			System.out.println();
        }
	}
}