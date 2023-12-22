
import java.awt.geom.Point2D;
import static java.math.BigDecimal.valueOf;
import java.util.*;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in)
	  .useDelimiter("[^0-9.]+");
  List<Point2D> points = new ArrayList<Point2D>();
  Set<Point2D> centers = new HashSet<Point2D>();
  while (in.hasNext()) {
	int n = in.nextInt();
	if (n > 0) {
	  points.clear();
	  for (int i = 0; i < n; i++) {
		Point2D center = getPoint(in);
		points.add(center);
	  }
	  for (Point2D s1 : points) {
		for (Point2D s2 : points) {
		  if (s1.distance(s2) <= 2) {
			double x = getCenter(s1.getX(), s2.getX());
			double y = getCenter(s1.getY(), s2.getY());
			centers.add(new Point2D.Double(x, y));
		  }
		}
	  }
	  centers.clear();
	  int max = 1;
	  for (Point2D c : centers) {
		int count = 0;
		for (Point2D p : points) {
		  if (p.distance(c) <= 1) {
			count++;
		  }
		}
		max = Math.max(count, max);
	  }
	  System.out.println(max);
	}
  }
}

private static double getCenter(double x2, double x3) {
  return valueOf(x2).add(valueOf(x3)).divide(valueOf(2d))
	  .doubleValue();
}

private static Point2D getPoint(Scanner in) {
  Point2D result =
	  new Point2D.Double(in.nextDouble(),
	      in.nextDouble());
  return result;
}
}