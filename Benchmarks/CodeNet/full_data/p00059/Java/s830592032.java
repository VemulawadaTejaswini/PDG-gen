import java.util.*;
import java.awt.geom.Rectangle2D;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextDouble()){
			double x1,y1,x2,y2;

			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();

			Rectangle2D r = new Rectangle2D.Double(x1,y1,x2-x1,y2-y1);
			double eps = 0.00000001;

			x1 = sc.nextDouble() - eps;
			y1 = sc.nextDouble() - eps;
			x2 = sc.nextDouble() + eps;
			y2 = sc.nextDouble() + eps;

			System.out.println(r.intersects(x1,y1,x2-x1,y2-y1) ? "YES" : "NO");
		}
	}
}