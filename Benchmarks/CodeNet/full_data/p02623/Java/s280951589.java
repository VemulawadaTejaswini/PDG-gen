import java.util.ArrayList;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// TODO 172_C
			Scanner sc = new Scanner(System.in);

			int iCnt = 0;
			int iMax = 0;

			String str1 = sc.nextLine();
			String deskA = sc.nextLine();
			String deskB = sc.nextLine();
			String[] strArray1 = str1.split(" ");
			String[] strDeskA = deskA.split(" ");
			String[] strDeskB = deskB.split(" ");

			int iBookA = Integer.parseInt(strArray1[0]);
			int iBookB = Integer.parseInt(strArray1[1]);
			Long lLimit = Long.parseLong(strArray1[2]);

			ArrayList<Long> lDeskA = new ArrayList<>();
			ArrayList<Long> lDeskB = new ArrayList<>();

			lDeskA.add((long) 0);
			lDeskB.add((long) 0);

			for(int i = 0; i < iBookA; i++) {
				lDeskA.add(lDeskA.get(i) + Long.parseLong(strDeskA[i]));
				if (lLimit < lDeskA.get(i+1)) {
					break;
				}
			}
			for(int i = 0; i < iBookB; i++) {
				lDeskB.add(lDeskB.get(i) + Long.parseLong(strDeskB[i]));
				if (lLimit < lDeskB.get(i+1)) {
					break;
				}
			}

			int b;
			for(int a = 0; a < iBookA + 1; a++) {

				iCnt = 0;
				// Aからi冊読む
				if (lLimit < lDeskA.get(a)) {
					break;
				}

				// 残りをBから読めるだけ読む
				for(b = 0; b < iBookB + 1; b++) {
					if (lLimit < lDeskA.get(a) + lDeskB.get(b)) {
						break;
					}
				}

				iCnt = a + b - 1;

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