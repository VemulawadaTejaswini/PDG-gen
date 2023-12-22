import java.util.ArrayList;
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
		Long lOnlyA = (long) 0;

		ArrayList<Long> lDeskA = new ArrayList<>();
		ArrayList<Long> lDeskB = new ArrayList<>();

		for(int i = 0; i < iBookA; i++) {
			lDeskA.add(Long.parseLong(strDeskA[i]));
		}
		for(int j = 0; j < iBookB; j++) {
			lDeskB.add(Long.parseLong(strDeskB[j]));
		}

		for(int i = 0; i < iBookA; i++) {

			// Aのa冊目まで読んだ時間を出す
			lTime = lOnlyA + lDeskA.get(i);
			if (lLimit < lTime) {
				break;
			} else {
				// 読んだ冊数を保持
				lOnlyA = lTime;
				iCnt = i + 1;
			}

			// 残りをBから読めるだけ読む
			for(int b = 0; b < iBookB; b++) {
				lTime = lTime + lDeskB.get(b);
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
