import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	double calc(int deg){
		double rad = Math.toRadians(deg);
		return Math.sin(rad);
	}
	
	void run(){
		for(;;){
			int n  = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int deg[] = new int[n+1];
			deg[0] = 0;
			deg[n] = 360;
			for(int i = 1; i < n ; i++){
				deg[i] = sc.nextInt();
			}
			double area = 0;
			int degsum = 360;
			for(int i = 0; i < n ;i++){
				area += calc(deg[i]);
				degsum -= deg[i];
			}
			area += calc(degsum);
			
			n = sc.nextInt();
			
			deg = new int[n+1];
			deg[0] = 0;
			deg[n] = 360;
			for(int i = 1; i < n ; i++){
				deg[i] = sc.nextInt();
			}
			double area2 = 0;
			degsum = 360;
			for(int i = 0; i < n ;i++){
				area2 += calc(deg[i]);
				degsum -= deg[i];
			}
			area2 += calc(degsum);
//			System.out.println(area+" "+area2);
			if(Math.abs(area - area2) < 1e-8){
				System.out.println(0);
			}else
			if(area>area2){
				System.out.println(1);
			}else{
				System.out.println(2);
			}
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}