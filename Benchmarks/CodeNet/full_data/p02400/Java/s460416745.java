import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static double circle(int r,double p){
		double cir = 2*p*r;
		return cir;
	}
	public static double area(int r, double p){
		double area = p*r*r;
		return area;
	}
	public static void main(String[] args) throws IOException{
		/**
		 * ?????°?????£?¨?
		 */
		int r = 0;
		double p = 3.141592653589;
		String str;
		/**
		 * ?????????????????\?????¨int??????     ??r*r,2??r
		 */
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		r = Integer.parseInt(str);
		System.out.printf("%8.6f ",circle(r,p));
		System.out.printf("%8.6f\n",area(r,p));
	}

}