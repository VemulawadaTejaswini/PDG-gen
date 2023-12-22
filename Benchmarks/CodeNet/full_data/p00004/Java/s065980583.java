import java.util.*;
import java.io.PrintWriter; 

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f,z,x,y;
		while(true){
			try{
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				d = sc.nextDouble();
				e = sc.nextDouble();
				f = sc.nextDouble();
				z = a*e-b*d;
				x = (c*e-b*f)/z;
				y = (a*f-c*d)/z;
				if(-0.0005< x && x <= 0)x = 0;
				if(-0.0005< y && y <= 0)y = 0; 
				System.out.println(String.format("%.3f %.3f",x ,y )); 
			}
			catch( InputMismatchException error){break;}
		}
	}
}