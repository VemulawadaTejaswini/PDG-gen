import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		double akakudo = (H * 30 + M * 0.5) % 360 ;
		double bkakudo = (M * 6) % 360 ;
		double ckakudo = Math.abs(akakudo-bkakudo);
		
		if (ckakudo>=180){
			ckakudo = 360 - ckakudo; 
		} else  {
			ckakudo = ckakudo;
		}
		
		double a = (double) A;
		double b = (double) B;
		
		double c = Math.sqrt(( Math.pow(a,2) + Math.pow(b,2) - 2*a*b*(Math.cos(Math.toRadians(ckakudo)) )));
		System.out.println(c);
		
		
	}
}