import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dataSet = scan.nextInt();
		ArrayList<String> ansList = new ArrayList<String>();

		for (int i = 0; i < dataSet; i++) {
			Point2D.Double a = new Point2D.Double(scan.nextDouble(), scan.nextDouble());
			Point2D.Double b = new Point2D.Double(scan.nextDouble(), scan.nextDouble());
			Point2D.Double c = new Point2D.Double(scan.nextDouble(), scan.nextDouble());
			Point2D.Double d = new Point2D.Double(scan.nextDouble(), scan.nextDouble());

			double  ab = (a.getX() > b.getX() ? Math.atan2(a.getY() - b.getY(), a.getX() - b.getX())
					: Math.atan2(b.getY() - a.getY(), b.getX() - a.getX()));

			double  cd = (c.getX() > d.getX() ? Math.atan2(c.getY() - d.getY(), c.getX() - d.getX())
					: Math.atan2(d.getY() - c.getY(), d.getX() - c.getX()));

			ansList.add(ab == cd ? "YES" :"NO");
		}

		for(String ans :ansList){
			System.out.println(ans);
		}
	}
}