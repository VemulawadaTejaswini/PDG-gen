import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		double h_kakudo = 30 * h + (double)m / 2;
		double m_kakudo = 6 * m;
		
		double kakudo_sa = Math.abs(h_kakudo - m_kakudo);
		if(kakudo_sa > 180) kakudo_sa = 360 - kakudo_sa; 
		
		if(kakudo_sa == 0) System.out.println(Math.abs(a - b));
		else if(kakudo_sa == 180) System.out.println(a + b);
		else {
			double c_2 = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(kakudo_sa));
			double ans = Math.sqrt(c_2);
			System.out.println(ans);
		}
		
	}

}
