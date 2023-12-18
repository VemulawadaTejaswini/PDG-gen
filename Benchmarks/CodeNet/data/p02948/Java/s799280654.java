import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		// バイトの件数
		int baitoNum = scan.nextInt();
		// バイト格納用配列
		int[] baito = new int[baitoNum*2];
		// 日数
		int day = scan.nextInt();

		int[][] a = new int[baitoNum][2];

		for(int i = 0;i<baitoNum;i++) {
			a[i][0] = scan.nextInt();
			a[i][1] = scan.nextInt();
		}

		// 並べ替え(報酬降順)
		for(int ii=0;ii<baitoNum;ii++) {
			for(int i=0;i<baitoNum-1;i++) {
				if(a[i][1]<a[i+1][1]) {
					int taihi1 = a[i][0];
					int taihi2 = a[i][1];

					a[i][0] = a[i+1][0];
					a[i][1] = a[i+1][1];

					a[i+1][0] = taihi1;
					a[i+1][1] = taihi2;
				}
			}
		}

		// 並べ替え(M日後昇順)
		for(int ii=0;ii<baitoNum;ii++) {
			for(int i=0;i<baitoNum-1;i++) {
				if(a[i][1]<a[i+1][1] && a[i][0]<a[i+1][0]) {
					int taihi1 = a[i][0];
					int taihi2 = a[i][1];

					a[i][0] = a[i+1][0];
					a[i][1] = a[i+1][1];

					a[i+1][0] = taihi1;
					a[i+1][1] = taihi2;
				}
			}
		}

		// 報酬計算用
		int moneyCount = 0;
		// 日付計算用
		int dayCount = 0;
		for(int i = 0;i<baitoNum;i++) {
			if(dayCount + a[i][0] <= day) {
				moneyCount += a[i][1];
			}
			dayCount += 1;
		}
		System.out.println(moneyCount);
		
	}

}
