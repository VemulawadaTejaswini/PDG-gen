//package ac144;
import java.util.*;
import java.math.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = scn.nextLong();
		long b = scn.nextLong();
		double x = scn.nextLong();
		
		double vol = a*a*b;
		
		if(x==vol/2) {
			System.out.println("45.0000000000");
		}else if(x<vol/2){
			double ar = x/a;
			double base = (ar*2)/b;
			double ang = (Math.atan(b/base))*(180/Math.PI);
			System.out.println(ang);
		}else {
			double ang = (Math.atan((2*b-(2*x/(a*a)))/a)*180)/Math.PI;
			System.out.println(ang);
		}

	}

}
