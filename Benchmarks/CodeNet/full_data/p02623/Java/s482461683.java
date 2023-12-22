import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 172_C
		Scanner sc = new Scanner(System.in);

		int iCnt = 0;
		int iMax = 0;
		Long lTime = (long) 0;

		String str1 = sc.nextLine();
		String deskA = sc.nextLine();
		String deskB = sc.nextLine();
		String[] strArray1 = str1.split(" ");
		String[] strDeskA = deskA.split(" ");
		String[] strDeskB = deskB.split(" ");

		int iBookA = Integer.parseInt(strArray1[0]);
		int iBookB = Integer.parseInt(strArray1[1]);
		Long lLimit = Long.parseLong(strArray1[2]);

		for(int i = 0; i < iBookA + 1; i++) {

			iCnt = 0;
			lTime = (long) 0;

			// Aからi冊読む
			for(int a = 0; a < i; a++) {
				lTime = lTime + Long.parseLong(strDeskA[a]);
				if (lLimit < lTime) {
					break;
				} else {
					iCnt++;
				}
			}
			if(lLimit < lTime) {
				break;
			}

			// 残りをBから読めるだけ読む
			for(int b = 0; b < iBookB; b++) {
				lTime = lTime + Long.parseLong(strDeskB[b]);
				if (lLimit < lTime) {
					break;
				} else {
					iCnt++;
				}
			}

			// 最大冊数を更新
			if (iMax < iCnt) {
				iMax = iCnt;
			}

		}

		System.out.println(iMax);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}

}
