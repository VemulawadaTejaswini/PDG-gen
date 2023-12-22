import static java.lang.Math.*;
import static java.math.BigInteger.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	Scanner cin = new Scanner(System.in);
	
	void run() {
		double a,b,c,d,e,f;
		while(cin.hasNext()){
			a = cin.nextDouble();
			b = cin.nextDouble();
			c = cin.nextDouble();
			d = cin.nextDouble();
			e = cin.nextDouble();
			f = cin.nextDouble();
			if(e==0){
				double myon = b - e * (double)a/d;
				double nokori = c - f * (double)a/d;
				double y = nokori/myon;
				double x;
				if(a!=0) x = (c-b*y)/a;
				else x = (f-e*y)/d;
				x+=1e-9;
				y+=1e-9;
				System.out.printf("%.3f %.3f",x,y);
			}
			else{
				double myon = a - d * (double)b/e;
				double nokori = c - f * (double)b/e;
				double x = nokori/myon;
				double y;
				if(b!=0) y = (c-a*x)/b;
				else y = (f-d*x)/e;
				x+=1e-9;
				y+=1e-9;
				System.out.printf("%.3f %.3f",x,y);
			}
		}
	}
}