import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String aCards = sc.nextLine();
		String bCards = sc.nextLine();
		String cCards = sc.nextLine();
		
		int nowTurn = 0; // Aさんから開始する
		int aCardNum = 0;
		int bCardNum = 0;
		int cCardNum = 0;
		int aCardMaxLen = aCards.length();
		int bCardMaxLen = bCards.length();
		int cCardMaxLen = cCards.length();
		
		
		char nowChar = 'z'; // 初期化
		
		// 結果が出るまで続ける
		while(true) {
			if(nowTurn == 0) {
				if (aCardNum >= aCardMaxLen) break; // 上がり
				nowChar = aCards.charAt(aCardNum);
				aCardNum++;
			} else if(nowTurn == 1) {
				if (bCardNum >= bCardMaxLen) break; // 上がり
				nowChar = bCards.charAt(bCardNum);
				bCardNum++;
			} else if (nowTurn == 2) {
				if (cCardNum >= cCardMaxLen) break; // 上がり
				nowChar = cCards.charAt(cCardNum);
				cCardNum++;
			}
			
			// 次の番を決める
			if ('a' == nowChar) {
				nowTurn = 0;
			} else if ('b' == nowChar) {
				nowTurn = 1;
			} else if ('c' == nowChar) {
				nowTurn = 2;
			}
		}
		
		// 勝者を表示
		System.out.println((char)('A' + nowTurn));
	}

}
