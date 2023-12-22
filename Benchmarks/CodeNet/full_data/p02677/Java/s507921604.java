import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double ang;
		double c;
		double angA = h * 30 + m * 0.5;
		double angB = m * 6;
		if(angA > angB) {
			ang = angA - angB;
			if(ang >= 180) ang = 360 - ang;
		}
		else if ( angA == angB) ang = 0;
		else {
			ang = angB -angA ;
			if(ang >= 180) ang = 360 - ang;
		}
		c = Math.pow(a, 2) + Math.pow(b, 2)
					- 2 * a * b * Math.cos(Math.toRadians(ang));
		c = Math.sqrt(c);
		String s = String.format("%.11f", c);
		System.out.println(s);
	}
}
