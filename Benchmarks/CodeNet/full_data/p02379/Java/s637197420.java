import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] line = br.readLine().split(" ");
      Point2D p1 = new Point2D(Double.parseDouble(line[0]), Double.parseDouble(line[1]));
      Point2D p2 = new Point2D(Double.parseDouble(line[2]), Double.parseDouble(line[3]));

      System.out.printf("%.8f",p1.distance(p2));
    }
  }
}

class Point2D {
  double x;
  double y;

  public Point2D(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point2D p) {
    return Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y), 2));
  }
}
