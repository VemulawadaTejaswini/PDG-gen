import java.util.*;
import java.awt.geom.*;

public class Main{
	
	//0033 cording start
	//0047 cording end
	//0118 sample matched
	//0119 WA
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int p = sc.nextInt();
			int n = sc.nextInt();
			if((p|n) == 0) break;
			double sqrtP = Math.sqrt(p);
			
			double nearMax = Integer.MAX_VALUE;
			int maxA = -1, maxB = -1;
			double nearMin = 0.0;
			int minA = -1, minB = -1;
			for(int i = 1; i <= n; i++){
				
				double temp = i * sqrtP;
				double temp2 = Math.ceil(temp);
				double temp1 = Math.floor(temp);
				double temp1i = temp1 / i;  // small
				double temp2i = temp2 / i;  //big
				//System.out.println("sqrtP = " + sqrtP + " temp = " + temp);
				//System.out.println("temp1 = " + temp1 + " temp2= " + temp2);
				//System.out.println("temp1i = " + temp1i + " temp2i = " + temp2i);
				//System.out.println("1 = " + (sqrtP - temp1i) + " " + (temp2i - sqrtP) );
				
				if((int)temp1 < n  && temp1i > nearMin){
					nearMin = temp1i;
					minA = (int) temp1;
					minB = i;
				}
				
				if((int) temp2 < n && temp2i < nearMax){
					nearMax = temp2i;
					maxA = (int) temp2;
					maxB = i;
				}
			}
			System.out.println(maxA + "/" + maxB + " " + minA +"/"+minB);
		}
	}
	
	public static void main(String[] args) {
		new Main().doit();
	}
}