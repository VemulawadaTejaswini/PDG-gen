import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0 ; i < n ; i++){
			double a,b,c,s,t,r;
			double a1,b1,c1,a2,b2,c2,x,y;
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			a = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
			b = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2, 2));
			c = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1, 2));
			s = (a+b+c)/2;
			t = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			r = (a*b*c)/(4*t);
			a1 = (x2-x1)*2;
			b1 = (y2-y1)*2;
			c1 = Math.pow(x1,2) - Math.pow(x2,2) + Math.pow(y1,2) - Math.pow(y2,2);
			a2 = (x3-x1) * 2;
			b2 = (y3-y1) * 2;
			c2 =Math.pow(x1,2) - Math.pow(x3,2) + Math.pow(y1,2) - Math.pow(y3,2);
			x = ((b1*c2) - (b2*c1))/((a1*b2) - (a2*b1));
			y = ((c1*a2) - (c2*a1))/((a1*b2) - (a2*b1));
			x = x * 1000;
			x = Math.round(x);
			x = x/1000;
			y = y * 1000;
			y = Math.round(y);
			y = y/1000;
			r = r * 1000;
			r = Math.round(r);
			r = r/1000;
			System.out.printf("%.3f %.3f %.3f\n",x ,y, r );

		}
		
		
		
		
		
		sc.close();
	}

}