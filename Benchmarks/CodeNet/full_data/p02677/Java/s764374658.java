import java.util.Scanner;

public class Main {
	static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		int a = src.nextInt();
		int b = src.nextInt();
		int h = src.nextInt();
		int m = src.nextInt();
		double radm = (360.0/12.0)/60.0;

		double c = 0;		// h == 11 のときの処理
		if(h == 11) {
			c = radm * m;
		}

		double hx = a * Math.cos(Math.toRadians(radm*h*60 + c));// hにおける1分あたりの角速度
		double hy = a * Math.sin(Math.toRadians(radm*h*60 + c));
		double mx = b * Math.cos(Math.toRadians(radm*m));		// mにおける1分あたりの角速度
		double my = b * Math.sin(Math.toRadians(radm*m));
		double dist = Math.sqrt(Math.pow((hx - mx), 2) + Math.pow(hy - my, 2));
		System.out.println(dist);
	}
}