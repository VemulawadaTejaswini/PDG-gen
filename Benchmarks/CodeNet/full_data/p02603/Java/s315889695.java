import java.util.Scanner;

public class Main {
	private static final int FLAT = 0;
	private static final int DOWN = -1;
	private static final int UP = 1;
	public static void main(String[] args) {
		int possession = 1000;
		int stockNum = 0;
		int status = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stock = new int[n];
		for (int i = 0; i < n; i++) {
			stock[i] = sc.nextInt();
		}
		//最初の傾向が出てくるまで待つ
		int date = 0;
		while(status == FLAT && date < n) {
			if(stock[date] < stock[date + 1]) {
				status = UP;
				int purchaseNum = 0;
				while(possession - stock[0] * (purchaseNum + 1) > 0) {
					purchaseNum++;
				}
				possession -= stock[0] * purchaseNum;
				stockNum = purchaseNum;
			}
			if(stock[date] > stock[date + 1]) {
				status = DOWN;
			}
			date++;
		}

		for (int i = 1; i < stock.length - 1; i++) {
			//底値かどうかを判断する
			if(status == DOWN && stock[i] < stock[i + 1]) {
				//購入
				int purchaseNum = 0;
				while(possession - stock[i] * (purchaseNum + 1) > 0) {
					purchaseNum++;
				}
				possession -= stock[i] * purchaseNum;
				stockNum = purchaseNum;
				status = UP;
				continue;
			}
			//天井値かどうかを判断する
			if(status == UP && stock[i] > stock[i + 1]) {
				//売却
				int saleNum = 0;
				while(stockNum - saleNum > 0) {
					saleNum++;
				}
				possession += stock[i] * saleNum;
				stockNum -= saleNum;
				status = DOWN;
			}
		}
		if(status == UP) {
			//売却
			int saleNum = 0;
			while(stockNum - saleNum > 0) {
				saleNum++;
			}
			possession += stock[stock.length - 1] * saleNum;
			stockNum -= saleNum;
			status = DOWN;
		}
		System.out.println(possession);
	}

}
