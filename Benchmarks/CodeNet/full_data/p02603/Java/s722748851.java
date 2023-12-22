import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int possession = 1000;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stock = new int[n];
		for (int i = 0; i < n; i++) {
			stock[i] = sc.nextInt();
		}
		for (int i = 0; i < stock.length - 1; i++) {
			int stocks = 0;
			//翌日が今よりも高かったら即購入
			//
			if(stock[i] < stock[i + 1]) {
				stocks = possession / stock[i];
				possession += (stock[i + 1] - stock[i])  * stocks;
			}
		}
		
		System.out.println(possession);
	}

}
