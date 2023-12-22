import static java.math.BigDecimal.valueOf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class BigPoint {

final BigDecimal x;
final BigDecimal y;

BigPoint(BigDecimal x, BigDecimal y) {
  this.x = x;
  this.y = y;
}

BigPoint(Scanner in) {
  this.x = in.nextBigDecimal();
  this.y = in.nextBigDecimal();
}

@Override
public boolean equals(Object obj) {
  if (this == obj) return true;
  BigPoint other = (BigPoint) obj;
  return (x.equals(other.x) && y.equals(other.y));
}

@Override
public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + x.hashCode();
  result = prime * result + y.hashCode();
  return result;
}
}

public class Main {
static boolean isCross(long r, BigPoint p1, BigPoint p2) {
  return distanceSq(p1, p2).compareTo(valueOf(r * r)) <= 0;
}

static BigDecimal distanceSq(BigPoint p1, BigPoint p2) {
  return ((p1.x.subtract(p2.x).pow(2)).add(
	  p1.y.subtract(p2.y).pow(2)));
}

static BigDecimal getCenter(BigDecimal a, BigDecimal b) {
  return (a.equals(b)) ? a : a.add(b).divide(valueOf(2d));
}

public static void main(String[] args) {
  Scanner in =
	  new Scanner(System.in).useDelimiter("[^0-9.]+");
  List<BigPoint> points = new ArrayList<BigPoint>();
  Set<BigPoint> centers = new HashSet<BigPoint>();
  int n = in.nextInt();
  while (n > 0) {
	points.clear();
	for (int i = 0; i < n; i++) {
	  points.add(new BigPoint(in));
	}
	centers.clear();
	for (BigPoint s1 : points) {
	  for (BigPoint s2 : points) {
		if (!s1.equals(s2) && isCross(2, s1, s2)) {
		  BigDecimal x = getCenter(s1.x, s2.x);
		  BigDecimal y = getCenter(s1.y, s2.y);
		  BigPoint c = new BigPoint(x, y);
		  centers.add(c);
		}
	  }
	}
	int max = 1;
	for (BigPoint c : centers) {
	  int count = 0;
	  for (BigPoint p : points) {
		if (isCross(1, c, p)) {
		  count++;
		}
	  }
	  max = Math.max(count, max);
	}
	System.out.println(max);
	n = in.nextInt();
  }
}
}