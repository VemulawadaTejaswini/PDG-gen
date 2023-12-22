import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int intCount = 0;

		int intScore[][];
        intScore = new int[50][3];

		int intTotal;
		while (true) {

        // 入力されるintM,intF,intRを定義

        int intM = scanner.nextInt();
        int intF = scanner.nextInt();
        int intR = scanner.nextInt();

        if (intM == -1 && intF == -1 && intR == -1) {
        	break;
        }

        intScore[intCount][0] = intM;
        intScore[intCount][1] = intF;
        intScore[intCount][2] = intR;

        intCount++;
		}
		for (int intI = 0; intI < intCount; intI++) {
			if (intScore[intI][0] == -1 || intScore[intI][1] == -1) {
			System.out.println("F");
			} else {
			if (intScore[intI][0] == -1) {
				intScore[intI][0] = 0;
			} else if (intScore[intI][1] == -1) {
				intScore[intI][1] = 0;
			}
			intTotal = intScore[intI][0] + intScore[intI][1];
			if (intTotal >= 80) {
				System.out.println("A");
			} else if (intTotal < 80 && intTotal >= 65) {
				System.out.println("B");
			} else if (intTotal < 65 && intTotal >= 50) {
				System.out.println("C");
			} else if (intScore[intI][2] >= 50) {
				System.out.println("C");
			} else if (intTotal < 50 && intTotal >= 30) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
			}
		}
	}
}

