import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();

		double hour = (30*H)+(M/2);
		int minute = 6*M;

		double angle = hour-minute;
		if(angle<0){
			angle *= -1;
		}else if(angle>180){
			angle = 360-angle;
		}
		double ans=0;
		if(angle==90||angle==270){
			ans = A*A+B*B;
			ans = Math.sqrt(ans);
		}else{
			ans = A*A+B*B-(2*A*B*Math.cos(Math.toRadians(angle)));
			ans = Math.sqrt(ans);
		}

		System.out.println(ans);
	}
}
