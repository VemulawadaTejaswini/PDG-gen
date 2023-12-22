import static java.lang.Math.*;

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			double a, b , C;
			a = scan.nextDouble();
			b = scan.nextDouble();
			C = scan.nextDouble();
			double S = a * b * sin(toRadians(C)) / 2;
			System.out.println(S);
			double c = sqrt(pow(a , 2) + pow(b , 2) - 2 * a * b * cos(toRadians(C))) ;
			System.out.println(a + b + c);
			double h = 2 * S / a ;
			System.out.println (h);
		}finally{
			if(scan!=null)scan.close();
		}
	}
}