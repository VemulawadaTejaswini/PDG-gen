/* Volume0 0004 Simultaneous Equation */
import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){

		double a,b,c,d,e,f,x,y;

		Scanner stdIn = new Scanner(System.in);

		while( stdIn.hasNext()){
			
			a = stdIn.nextDouble();
			b = stdIn.nextDouble();
			c = stdIn.nextDouble();
			d = stdIn.nextDouble();
			e = stdIn.nextDouble();
			f = stdIn.nextDouble();
			
			if( a*e-b*d == 0 ){
				x = 0.0;
				y = 0.0;
			} else if( c*e-b*f==0 ){
				x = 0.0;
				y = c/b;
			} else if( c*d-a*f==0 ){
				x = c/a;
				y = 0.0;
			} else {
				x = (c*e-b*f)/(a*e-b*d);
				y = (c*d-a*f)/(b*d-a*e);
			}
			
			System.out.printf("%.3f",x);
			System.out.print(" ");
			System.out.printf("%.3f",y);
			System.out.println();
			
		}
	}
}