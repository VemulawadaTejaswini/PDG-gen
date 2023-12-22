import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double hAngle = h * 30.0 + m * 0.5;
		double mAngle = m * 6.0; 
		double angle = mAngle - hAngle;
		if(Math.abs(mAngle - hAngle) > 180 ) {
			angle = 360.0 - angle;
		}else {			
			angle *= -1;
		}
		double cos = Math.cos(Math.toRadians(angle));
		double result =  Math.sqrt(a*a + b*b - (2.0*a*b*cos));
		System.out.println(result);
		sc.close();
	}
}
