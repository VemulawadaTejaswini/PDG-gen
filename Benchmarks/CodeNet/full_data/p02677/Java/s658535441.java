//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		double h = 360/12*H+0.5*M;
		double m = 6*M;
	
			double kaku = h-m;
			if(kaku>180) {
				kaku = 360-kaku;
			}
			mat(A,B,Math.abs(kaku));
		
		
		
		}
	
	public static void mat(double A,double B,double shita){
		//System.out.println(shita);
		double kakudo = Math.toRadians(shita);
		//System.out.println(kakudo);
		double ans = Math.pow(A, 2)+Math.pow(B, 2)-2*A*B*Math.cos(kakudo);
		double Ans = Math.sqrt(ans);
		System.out.println(Ans);
	}
}
