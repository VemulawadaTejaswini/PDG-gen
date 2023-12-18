import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		double c = ((2 * x) / Math.pow(a,  2)) - b;
		if(c >= 0) {
		   double lengthalpha = b -c;
		   double lengthbeta = Math.sqrt(Math.pow(a, 2) + Math.pow(b - c, 2));
		   double siny = a / lengthbeta;
		   double y = Math.asin(siny);
		   double degree = Math.toDegrees(y);
		   System.out.println(180 - 90 - degree);
		}else if(c < 0) {
			c = 0;
			double lengthganma = x / (a * b);
			double lengthdelta = Math.sqrt(Math.pow(b,  2) + Math.pow(lengthganma, 2));
			double sinz = lengthganma / lengthdelta;
			double z = Math.asin(sinz);
			double degree2 = Math.toDegrees(z);
			System.out.println(180 - 90 - degree2);
		}
	   }
	}