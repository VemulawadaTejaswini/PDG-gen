import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static int n;
	public static void main(String args[]){
		run();
	}
	static void run(){
		int[] price = new int[200000];
		n = scan.nextInt();
		for(int i = 0; i < n; i++){
			price[i] = scan.nextInt();
		}
		System.out.println(isMaxPrice(price));;
	}
	static int isMaxPrice(int[] price){
		int maxPrice;
		int priceTmp;
		maxPrice = -(1000000000 - 1);
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				priceTmp = price[j] - price[i];
				if(maxPrice < priceTmp){
					maxPrice = priceTmp;
				}
			}
		}
		return maxPrice;
	}
}