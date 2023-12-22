

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		int[] numList = new int[6];

		try {
			sc = new Scanner(System.in);
			while (sc.hasNext()) {
				//??°???5???????????????(roop)
				for (int i = 0; i < 6; i++) {
					numList[i] = sc.nextInt();
				}

				//X????¨????
				double numX = (numList[2] * numList[4] - numList[1] * numList[5])
						/(numList[0] * numList[4] - numList[1] * numList[3]);
				String X = String.format("%.3f", numX);

				//Y????¨????
				double numY = (numList[5] - numList[3] * numX) / numList[4];
				String Y = String.format("%.3f", numY);

				//???????????????(?°???°?¬¬?????? ?????¨?????\)
				System.out.println(X + " " + Y);
			}

		}catch (Exception e) {

		} finally {
			if (sc != null) {
				try {
					sc.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}