import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int[][] boxN;
		int[] boxM;
		int[] InputList = new int[2];

		int anser = 0;

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			for (int i = 0; i < InputList.length; i++) {
				InputList[i] = sc.nextInt();
			}

			//??????N?????????
			boxN = new int[InputList[0]][InputList[1]];

			for (int i = 0; i < InputList[0]; i++) {

				//N??????????????????
				for (int j = 0; j < InputList[1]; j++) {

					boxN[i][j] = sc.nextInt();
				}
			}

			//??????M?????????
			boxM = new int[InputList[1]];

			for (int i = 0; i < InputList[1]; i++) {
				boxM[i] = sc.nextInt();
			}

			//?¨????
			for (int i = 0; i < InputList[0]; i++) {
				for (int j = 0; j < InputList[1]; j++) {

					anser += boxN[i][j] * boxM[j];
				}
				//???????????????
				System.out.println(anser);
				//????????????
				anser = 0;
			}
		} finally {
			sc.close();
		}

	}

}