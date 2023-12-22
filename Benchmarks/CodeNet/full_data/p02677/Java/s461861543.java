import java.util.Scanner;
//import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		//calculate angle
		int larger = Math.max(h*30, m*6);
		int smaller = Math.min(h*30, m*6);
		int diff = larger - smaller;
		if (diff == 180) {System.out.println(a+b);}
		else {
			double angle = Math.toRadians(Math.min(diff, 360-diff));
		//calculate distance
		double ans = Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(angle);
		System.out.println(Math.sqrt(ans));
		}
		sc.close();
	}

}
