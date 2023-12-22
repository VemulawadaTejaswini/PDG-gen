import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static int n;
	public static void main(String args[]){
		run();
	}
	static void run(){
		int n, firstPriceTmp, priceTmp;
		int minPrice, maxPrice;
		int maxBenefit, benefit;
		
		maxBenefit = -(1000000000 - 1);
		minPrice = 1000000000;
		maxPrice = 1;
		n = scan.nextInt();
		
		firstPriceTmp = scan.nextInt();
		for(int i = 1; i < n; i++){
			priceTmp = scan.nextInt();
			minPrice = Math.min(minPrice, firstPriceTmp);
			firstPriceTmp = priceTmp;
			benefit = priceTmp - minPrice;
			maxBenefit = Math.max(benefit, maxBenefit);
		}
		System.out.println(maxBenefit);
	}
}