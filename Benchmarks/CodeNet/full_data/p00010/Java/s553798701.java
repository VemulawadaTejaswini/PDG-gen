import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int n;
	static double x1, x2, x3, y1, y2, y3, xp, yp, r;
	static double a, b, c, d, e, f, s, t, u;
	
	public static void main(String[] args) {
		
		n = sc.nextInt();
		
		for(int i=0; i < n; i++){
		
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			
			a = x1 - x2;
			b = y1 - y2;
			c = -1 * (Math.pow(x1, 2) - Math.pow(x2, 2) + Math.pow(y1, 2) - Math.pow(y2, 2));
			d = x1 - x3;
			e = x1 - x3;
			f = -1 * (Math.pow(x1, 2) - Math.pow(x3, 2) + Math.pow(y1, 2) - Math.pow(y3, 2));
			
			s = (c * e - b * f) / (e * a - b * d);
	        t = (d * c - a * f) / (d * b - e * a);
	        u = -1 * (Math.pow(x1, 2) + Math.pow(y1, 2) + s * x1 + t * y1);
	        
	        xp = s / -2.0;
	        yp = t / -2.0;
	        r = Math.sqrt(Math.pow(s, 2) + Math.pow(t, 2) - 4 * u) / 2.0;
	        
	        System.out.printf("%.3f %.3f %.3f\n", xp, yp, r);
		}
	}

}