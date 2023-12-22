import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
	//static int coins[];
	static int coin_hash[] = {1, 5, 10, 50, 100, 500};
	static int min_coin;
	static int coins[];

	public static void main(String args[]){
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		while(true){
			int price = scanner.nextInt();
			if(price == 0) return;

			coins = new int[6];
			int all_sum = 0;
			for(int i = 0; i < 6; i++){
				coins[i] = scanner.nextInt();
				all_sum += coin_hash[i] * coins[i];
			}

			min_coin = 0;
			//System.out.println(all_sum);
			//System.out.println(priceToCoins(price));
			//System.out.println(priceToCanCoins(price));

			int max_change = Math.min(500, all_sum - price);
			//System.out.println("Max change: " + max_change);

			for(int i = 0; i <= max_change; i++){
				// ここでコインの数数える
				int pay_coin = priceToCanCoins(price + i);
				//System.out.println("pay cpin:" + pay_coin);
				if(pay_coin == -1) continue;

				int change_coin = priceToCoins(i);
				int sum_coin = pay_coin + change_coin;

				if(min_coin == 0){
					min_coin = sum_coin;
				}else if(min_coin > sum_coin){
					min_coin = sum_coin;
				}
			}
			System.out.println(min_coin);
		}
	}

	static int priceToCoins(int price){
		int count = 0;
		while(price >= 500){
			count++;
			price -= 500;
		}
		while(price >= 100){
			count++;
			price -= 100;
		}
		while(price >= 50){
			count++;
			price -= 50;
		}
		while(price >= 10){
			count++;
			price -= 10;
		}
		while(price >= 5){
			count++;
			price -= 5;
		}
		count += price;
		return count;
	}

	static int priceToCanCoins(int price){
		int count = 0;
		int c = 0;
		while(price >= 500 && c < coins[5]){
			c++;
			price -= 500;
		}
		count += c;
		c = 0;
		while(price >= 100 && c < coins[4]){
			c++;
			price -= 100;
		}
		count += c;
		c = 0;
		while(price >= 50 && c < coins[3]){
			c++;
			price -= 50;
		}
		count += c;
		c = 0;
		while(price >= 10 && c < coins[2]){
			c++;
			price -= 10;
		}
		count += c;
		c = 0;
		while(price >= 5 && c < coins[1]){
			c++;
			price -= 5;
		}
		count += c;
		if(price > coins[0]) return -1;
		count += price;
		return count;
	}


	static void print(int a[]){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

	static void print(int m[][]){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void print(ArrayList<StringBuilder> array){
		for(int i = 0; i < array.size(); i++){
			System.out.println(array.get(i));
		}
	}
}