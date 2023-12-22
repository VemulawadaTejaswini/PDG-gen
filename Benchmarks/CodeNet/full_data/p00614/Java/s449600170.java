import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
	//static int coins[];
	static int coin_hash[] = {1, 5, 10, 50, 100, 500};
	static int price;
	static int min_coin;

	public static void main(String args[]){
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		while(true){
			price = scanner.nextInt();
			if(price == 0) return;

			int coins[] = new int[6];
			for(int i = 0; i < 6; i++){
				coins[i] = scanner.nextInt();
			}
			//System.out.println(coinsToPrice(coins));
			min_coin = 0;
			solve(0, 0, 5, coins);
			System.out.println(min_coin);

			min_coin = 0;
			solve500(price, coins);
			System.out.println(min_coin);
		}
	}

	static void solve500(int rest_price, int coins[]){
		int coins500 = rest_price / 500;
		if(coins500 >= coins[5]){
			coins500 = coins[5];
			solve(coins500, coins500*500, 4, coins);
			// System.out.println("500円玉" + coins500 + "枚");
		}else if(rest_price % 500 == 0){
			min_coin = coins500;
			// System.out.println("500円玉" + coins500 + "枚");
			return;
		}else{
			// System.out.println("500円玉" + coins500 + "枚");
			// System.out.println("500円玉" + (coins500 + 1) + "枚");
			solve(coins500 + 1, coins500*500 + 500, 4, coins);
			solve(coins500, coins500*500, 4, coins);
		}
	}


	static void solve(int sum_coins, int sum_price, int coin_position, int coins[]){
		if(min_coin != 0 && sum_coins >= min_coin) return;
		if(coin_position < 0){
			int charge = sum_price - price;
			if(charge < 0) return;
			int charge_coins = priceToCoins(charge);
			sum_coins += charge_coins;
			if(min_coin == 0){
				min_coin = sum_coins;
			}else if(sum_coins < min_coin){
				min_coin = sum_coins;
			}
			return;
		}
		for(int i = 0; i <= coins[coin_position]; i++){
			solve(sum_coins + i, sum_price + coin_hash[coin_position] * i, coin_position - 1, coins);
		}
	}

	static int coinsToPrice(int input_coins[]){
		int result = 0;
		result += input_coins[0];
		result += input_coins[1] * 5;
		result += input_coins[2] * 10;
		result += input_coins[3] * 50;
		result += input_coins[4] * 100;
		result += input_coins[5] * 500;
		return result;
	}

	static int priceToCoins(int price){
		//int coins[] = new int[6];
		int count = 0;
		while(price >= 500){
			//coins[5]++;
			count++;
			price -= 500;
		}
		while(price >= 100){
			//coins[4]++;
			count++;
			price -= 100;
		}
		while(price >= 50){
			//coins[3]++;
			count++;
			price -= 50;
		}
		while(price >= 10){
			//coins[2]++;
			count++;
			price -= 10;
		}
		while(price >= 5){
			//coins[1]++;
			count++;
			price -= 5;
		}
		//coins[0] = price;
		// 残りは1円玉
		count += price;
		//return coins;
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