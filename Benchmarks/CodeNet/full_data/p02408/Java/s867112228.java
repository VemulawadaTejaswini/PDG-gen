import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int sum = Integer.parseInt(line);

		StringBuilder X = new StringBuilder();
		for (int i = 0; i < sum; i++) {
			String linex = sc.nextLine();
			X.append(linex+" ");
		}

		String CARD = X.toString();
		String[] SHCD = CARD.split(" ") ;

		/**
		 * スペードが'S'、ハートが'H'、クラブが'C'、ダイヤが'D'
		 * split arraylist を使うと思う
		 */
		//マークごとのカード
		List<String> S = new ArrayList<String>();
		List<String> H = new ArrayList<String>();
		List<String> C = new ArrayList<String>();
		List<String> D = new ArrayList<String>();
		//マークごとのカード枚数
		int s = 0;
		int h = 0;
		int c = 0;
		int d = 0;
		//マークわけて数値の取り出し(Listインターフェース)
		for (int i = 0; i < SHCD.length; i++) {
			if (SHCD[i].contains("S")) {
				S.add(SHCD[i+1]);
				s++;
			} else if (SHCD[i].contains("H")){
				H.add(SHCD[i+1]);
				h++;
			} else if (SHCD[i].contains("C")){
				C.add(SHCD[i+1]);
				c++;
			} else if (SHCD[i].contains("D")){
				D.add(SHCD[i+1]);
				d++;
			}
		}

		//int配列でマークごとの数値
		int[] S2 = new int[s];
		int[] H2 = new int[h];
		int[] C2 = new int[c];
		int[] D2 = new int[d];

		for (int i = 0; i < s; i++) {
			int listS = Integer.parseInt(S.get(i));
			S2[i] = listS;
		}
		for (int i = 0; i < h; i++) {
			int listH = Integer.parseInt(H.get(i));
			H2[i] = listH;
		}
		for (int i = 0; i < c; i++) {
			int listC = Integer.parseInt(C.get(i));
			C2[i] = listC;
		}
		for (int i = 0; i < d; i++) {
			int listD = Integer.parseInt(D.get(i));
			D2[i] = listD;
		}

		//昇順にする
		Arrays.sort(S2);
		Arrays.sort(H2);
		Arrays.sort(C2);
		Arrays.sort(D2);

		//マークごとに足りない数値を出力する
		int num = 0;
		for (int i = 1; i <= 13; num++) {
			while (S2[num] >= i) {
				if (S2[num] != i) {
					System.out.println("S " +i);
				}
				i++;
			}
		}
		num = 0;
		for (int i = 1; i <= 13; num++) {
			while (H2[num] >= i) {
				if (H2[num] != i) {
					System.out.println("H " + i);
				}
				i++;
			}
		}
		num = 0;
		for (int i = 1; i <= 13; num++) {
			while (C2[num] >= i) {
				if (C2[num] != i) {
					System.out.println("C " + i);
				}
				i++;
			}
		}
		num = 0;
		for (int i = 1; i <= 13; num++) {
			while (D2[num] >= i) {
				if (D2[num] != i) {
					System.out.println("D " + i);
				}
				i++;
			}
		}



	}

}

