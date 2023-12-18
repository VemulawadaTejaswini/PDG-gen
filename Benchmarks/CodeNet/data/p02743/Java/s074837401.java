import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a= sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = c - a - b;//これがマイナスになったら
		//全てを整数にする
		/*
		double s = 2*Math.sqrt(a)*Math.sqrt(b);
		double s1 = s+a+b;
		if(s < c) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		*/
		if( d > 0 && 4*a*b < d*d ) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		
	
	}
}
	