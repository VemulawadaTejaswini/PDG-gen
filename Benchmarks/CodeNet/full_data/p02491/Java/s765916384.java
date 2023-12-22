import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int d, r;
		double f;
		
		d = a / b;
		r = a % b;
		f = 1.0 * a / b;
		
		System.out.println(d + " " + r + " " + f);

	}

}