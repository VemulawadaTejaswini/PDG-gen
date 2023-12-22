import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static int n;
	public static void main(String args[]){
		run();
	}
	static void run(){
		int n, firstPriceTmp, secondPriceTmp;
		int minPrice, maxPrice;
		int maxBenefit;
		
		minPrice = 200000;
		maxPrice = 2;
		n = scan.nextInt();
		
		firstPriceTmp = scan.nextInt();
		for(int i = 1; i < n; i++){
			secondPriceTmp = scan.nextInt();
			minPrice = Math.min(minPrice, firstPriceTmp);
			maxPrice = Math.max(maxPrice, secondPriceTmp);
			firstPriceTmp = secondPriceTmp;
		}
		maxBenefit = maxPrice - minPrice;
		System.out.println(maxBenefit);
	}
}