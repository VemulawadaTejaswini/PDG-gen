import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			double x1 = s.nextDouble();
			double y1 = s.nextDouble();
			double x2 = s.nextDouble();
			double y2 = s.nextDouble();
			double x3 = s.nextDouble();
			double y3 = s.nextDouble();
			
			double a1 = 2 * (x2 - x1);
			double b1 = 2 * (y2 - y1);
			double c1 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
			double a2 = 2 * (x3 - x1);
			double b2 = 2 * (y3 - y1);
			double c2 = x1 * x1 - x3 * x3 + y1 + y1 - y3 * y3;
			
			double x = (b1*c2 - b2*c1)/(a1*b2 - a2*b1);
			double y = (c1*a2 - c2*a1)/(a1*b2 - a2*b1);
			
			double l = Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
			x *= 10000;
			y *= 10000;
			l *= 10000;
			if(x % 10 >= 5) {
				x -= x%10;
				x += 10;
			}
			else {
				x -= x%10;
			}
			if(y % 10 >= 5) {
				y -= y%10;
				y += 10;
			}
			else {
				y -= y%10;
			}
			if(y % 10 >= 5) {
				y -= y%10;
				y += 10;
			}
			else {
				y -= y%10;
			}
			x /= 10000;
			y /= 10000;
			l /= 10000;
			
			
			
			System.out.printf("%.3f %.3f %.3f\n",x,y,l);
		}
	}
}