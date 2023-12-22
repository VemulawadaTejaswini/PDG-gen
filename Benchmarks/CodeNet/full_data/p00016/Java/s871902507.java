import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		double x,y;
		x = 0;
		y = 0;
		int deg = 90;
		for(;;){
			String str = sc.next();
			if(str.equals("0,0"))break;
			str = str.replace(',', ' ');
			Scanner buf = new Scanner(str);
			int d = buf.nextInt();
			
			x += d*Math.cos(deg*Math.PI/180);
			y += d*Math.sin(deg*Math.PI/180);
			
			int t = buf.nextInt();			
			deg += t;
		}
		System.out.println((int)-x );
		System.out.println((int)y );
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}