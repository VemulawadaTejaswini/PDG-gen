import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int x,h,power_Sum;
	static double S, h_tri, S_tri;
	static final double EPS = 1.0e-6;
	public static void main(String[] args) {
		while(read()){
			slove();
		}
	}
	static boolean read(){
		if(!sc.hasNextInt())return false;
		x = h = 0;
		x = sc.nextInt();
		h = sc.nextInt();
		S = h_tri = S_tri = 0;
		power_Sum = 0;
		if(x == 0 && h == 0)return false;
		
		return true;
	}
	static void slove(){
		//System.out.println();
		power_Sum = x*x/4 + h*h;
		h_tri = Newton(power_Sum);
		S_tri = x * h_tri * 2;
		S = S_tri + x * x;
		System.out.println(S);
	}
	static double Newton(double input){
		double old_x = 0.0;
		double new_x = 0.0;
		new_x = input;
		
		while(Math.abs(new_x - old_x) > EPS){
			old_x = new_x;
			new_x = (old_x + input/old_x)/2.0;
		}
		return new_x;
	}
}