import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		double theta = Math.abs(h * 30 - m*6);		
		double c = a*a + b*b - 2*a*b*Math.cos(Math.toRadians(theta));
		System.out.println(Math.sqrt(c));
		
        sc.close();
	}
}