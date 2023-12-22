import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		double r = sc.nextDouble();
		
		double r2, pai;
		
		r2 = r * r * Math.PI;
		pai = r * 2 * Math.PI;
		
		System.out.printf("%.6f ",r2);
		System.out.printf("%.6f",pai);

	}

}