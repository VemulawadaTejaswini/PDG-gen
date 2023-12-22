import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int t = h * 60 + m;
		
		double thetaA = t / 720.0;
		double thetaB = m / 60.0;
		
		double radA = Math.toRadians(thetaA);
		double radB = Math.toRadians(thetaB);
		
		double xA = a * Math.cos(radA);
		double yA = a * Math.sin(radA);
		double xB = b * Math.cos(radB);
		double yB = b * Math.sin(radB);
		
//		System.out.println("thetaA=" + thetaA);
//		System.out.println("thetaB=" + thetaB);
//		
//		System.out.println("xA=" + xA);
//		System.out.println("yA=" + yA);
//		System.out.println("xB=" + xB);
//		System.out.println("yB=" + yB);
		
		double dist = Point.distance(xA, yA, xB, yB);
		System.out.println(dist);
	}
}
