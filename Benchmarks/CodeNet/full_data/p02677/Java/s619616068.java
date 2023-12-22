import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double Mangle = (m*360)/60;
		double Hangle = (h*60+m)*360/(12*60);
		double MHangle = 0;
		if(Hangle-Mangle>180) {
			MHangle = 360-(Hangle-Mangle);
		}else {
			MHangle = Hangle-Mangle;
		}
		double cosA = Math.cos(MHangle*(Math.PI/180));
 		
		double answer = (a*a)+(b*b)-(2*a*b*cosA);
		double ans = Math.sqrt(answer);
		
		System.out.println(ans);
		
	}
}