

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double h = scan.nextDouble();
		double m = scan.nextDouble();
		
		double zishinKakudo =  (Math.PI*m/6/60)+(Math.PI*h/6);
		double hunshinKakudo = Math.PI*2*m/60;
		
		double diff = Math.abs(zishinKakudo - hunshinKakudo);
		
		if(diff > Math.PI) {
			diff = diff - Math.PI;
		}
		
		double L = a*a+b*b-(2*a*b*Math.cos(diff));
		double l = Math.sqrt(L);
		System.out.println(l);
		
	}

}
