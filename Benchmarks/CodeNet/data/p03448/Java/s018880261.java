import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input
			// each coin num
			// amount
		// pattern num
		//logic
			//1.(総当たり式)amoutから各パターン(各coinの合計)を引いて、0になったら有効なパターンとしてカウント。
				//(各コインの枚数分試行する必要があるので、三重ループ)
				//一番値が大きいcoinから決め打ちにする
				//問題
					//三重ループだと重い
			//2.
		Scanner scan = new Scanner(System.in);
		
		int num_500Coin = scan.nextInt();
		int num_100Coin = scan.nextInt();
		int num_50Coin = scan.nextInt();
		int target_amount = scan.nextInt();
		
		int n_pattern=0;
		
		//条件check
		if(num_500Coin<0 || num_500Coin > 50) return;
		if(num_100Coin<0 || num_100Coin > 50) return;
		if(num_50Coin<0 || num_50Coin > 50) return;
		if((num_500Coin + num_100Coin + num_50Coin)<1) return;
		if(target_amount<50 || target_amount>20000) return;
		if(target_amount%50 !=0) return;
		
		//caluc
		int y;
		
		for(int i = 0;i <= num_500Coin;i++) {
			y = target_amount - 500*i;
			if(y<0) continue;
			if(y==0) {//他のコインが0枚のパターン
				n_pattern++;
				continue;
			}
			
			for(int j = 0;j <= num_100Coin;j++) {
				int tmp1;
				tmp1 = y - 100*j;
				if(tmp1<0) continue;
				if(tmp1==0) {
					n_pattern++;
					continue;
				}
				
				for(int k = 0;k <= num_50Coin;k++) {
					int tmp2;
					tmp2 = tmp1 - 50*k;
					if(tmp2<0) continue;
					if(tmp2==0) {
						n_pattern++;
						continue;
					}
					
				}
			}
		}
		
		System.out.println(n_pattern);
		
		//よりスコアが高い人のロジック
		/*
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int j = 0;
		for(int i = 0;i <= a;i++) { 
			for(int s = 0;s <= b;s++) { 
				for(int q = 0;q <= c;q++) { 
					if(500 * i + 100 * s + 50 * q == x) {
						j++;
					}
				}
			}
		}
		*/
	}

}
