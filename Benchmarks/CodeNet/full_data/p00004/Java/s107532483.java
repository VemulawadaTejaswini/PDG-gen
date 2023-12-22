import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, e, f;
		double x, y;
		boolean flg;
		while(sc.hasNext()){
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = sc.nextDouble();
			e = sc.nextDouble();
			f = sc.nextDouble();
			
			y = (d*c - a*f) / (b*d - a*e);
			if(d == 0){
				x = (c - e * y) / a;
			}else{
				x = (f - e*y) / d;
			}
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}