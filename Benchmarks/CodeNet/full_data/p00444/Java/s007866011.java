import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a, sum;
		int[] coins = {500, 100, 50, 10, 5, 1};
		while((a = 1000 - sc.nextInt()) != 1000){
			sum = 0;
			for(int coin:coins){
				sum += a / coin;
				a = a % coin;
			}
			System.out.println(sum);
		}
	}
}