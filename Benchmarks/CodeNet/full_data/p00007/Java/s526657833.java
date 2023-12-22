import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sum = 100000;

		double n = sc.nextDouble();

		System.out.println((int)solve(n, sum));
	}

	public static double solve(double a, double b){

		for(int i = 0; i < a; i++){
			b = b * 1.05;
			
			if((b % 1000) != 0){
				BigDecimal bd = new BigDecimal(b / 1000);
				b = (bd.setScale(0, BigDecimal.ROUND_UP).doubleValue()) * 1000;
			}
		}
		return b;
	}
}