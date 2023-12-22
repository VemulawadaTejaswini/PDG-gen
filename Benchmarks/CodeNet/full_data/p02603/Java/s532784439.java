import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		//money:お金
		int money = 1000;
		//stock:株
		int stock = 0;
		//N:期間
		int n = Integer.parseInt(sc.next());
		//各日の株予想
		int[] longArr = new int[n];
		for (int i=0; i<n; i++) {
			longArr[i] = Integer.parseInt(sc.next());
		}
		//初回売り買いチェック
		if (longArr[0] <= longArr[1]) {
			stock = money / longArr[0];
			money = money % longArr[0];
		}
		
		for (int i=1; i<n-1; i++) {
			//case : 株を買う->底値の時
			if(stock == 0 && longArr[i] <= longArr[i-1]  && longArr[i] <= longArr[i+1] ) {
				stock = money / longArr[i];
				money = money % longArr[i];
			//case : 株を売る->天井の時
			} else if (stock != 0 && longArr[i-1] <= longArr[i]  && longArr[i+1] <= longArr[i] ) {
				money += longArr[i]*stock;
				stock = 0;
			}
		}
		
		//最終的に株持ってたら売る
		if (stock != 0) {
			money += longArr[n-1]*stock;
		}
		System.out.println(money);
	}
}
