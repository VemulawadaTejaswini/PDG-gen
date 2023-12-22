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
		int minPrice;
		int maxBenefit;
		int benefit;
		maxBenefit = -(1000000000 - 1);
		minPrice = price[0];
		for(int i = 0; i < n; i++){
			for(int j = i - 1; j > 0; j--){
				if(minPrice > price[j]){
					minPrice = price[j];
				}
				benefit = price[i] - minPrice;
				if(maxBenefit < benefit){
					maxBenefit = benefit;
				}
			}
		}
		return maxBenefit;
	}
}