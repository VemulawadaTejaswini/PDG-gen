import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("0.00000 0.00000");
		kochCalc(0, 0, 100, 0, n);
		System.out.println("100.00000 0.00000");
	}
	
	public static void kochCalc(double x1, double y1, double x2, double y2, int n){
		
		if (n==0)return;
		
		double dis = Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2),.5);
		double true_dis = dis/3;
		double ang = Math.atan2(y2-y1,x2-x1);
		
		double sx = x1 + Math.cos(ang)*true_dis;
		double sy = y1 + Math.sin(ang)*true_dis;
		double tx = sx + Math.cos(ang)*true_dis;
		double ty = sy + Math.sin(ang)*true_dis;
		double ux = sx + Math.cos(ang+Math.PI/3)*true_dis;
		double uy = sy + Math.sin(ang+Math.PI/3)*true_dis;
		
		kochCalc(x1, y1, sx, sy, n-1);
		System.out.printf("%.5f %.5f\n",sx,sy);
		kochCalc(sx, sy, ux, uy, n-1);
		System.out.printf("%.5f %.5f\n",ux,uy);
		kochCalc(ux, uy, tx, ty, n-1);
		System.out.printf("%.5f %.5f\n",tx,ty);
		kochCalc(tx, ty, x2, y2, n-1);
		
		
	}
}
