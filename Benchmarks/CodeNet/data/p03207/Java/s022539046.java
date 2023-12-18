package archiveBeginner;

import java.util.Scanner;

public class XmasEve {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		//個数Nに応じた商品の価格を配列に格納していく
		int[]  price = new int[N];

		//個数N個における商品の合計金額
		int total = 0;
		int maxPrice = 0;

		for(int i = 0 ; i<price.length ; i++) {

			//for文を使って配列に値を入力していく
			price[i] = sc.nextInt();

			System.out.println(i+1 + "つ目の商品お値段" + price[i] + "円");

			total += price[i];

			//最高価格の抽出
			if(price[i] >= maxPrice ) {
				maxPrice = price[i];
			}else {
				maxPrice = maxPrice;
			}
		}
			 int answer = total - maxPrice/2 ;

			System.out.println("答えは" + answer + "円" );

	}
}
