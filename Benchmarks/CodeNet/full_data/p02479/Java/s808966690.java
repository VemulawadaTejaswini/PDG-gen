import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double r = sc.nextDouble();
		
		double S = Math.pow(r, 2.0) * Math.PI;
		double l = 2 * r * Math.PI;
		
		System.out.printf("%.6f %.6f", S, l);
		
	}

}