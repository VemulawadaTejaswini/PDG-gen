import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            String[] tmpArray = br.readLine().split(" ");
            Point2D[] points = new Point2D[4];
            
            for(int j = 0; j < 4; j++) {
                int x = Integer.parseInt(tmpArray[j * 2]);
                int y = Integer.parseInt(tmpArray[j * 2 + 1]);
                
                points[j] = new Point2D.Double(x, y);
            }
            
            Line2D[] lines = new Line2D[2];
            
            for(int j = 0; j < 2; j++) {
                lines[j] = new Line2D.Double(points[j * 2], points[j * 2 + 1]);
            }
            
            Point2D result = crossPoint(lines[0], lines[1]);
            
            System.out.printf("%.8f %.8f\n", result.getX(), result.getY());
        }
    }
    static Point2D crossPoint(Line2D line1, Line2D line2) {
        if(!line1.intersectsLine(line2)) return null;
        
        if(line1.getX1() == line1.getX2()) {
            double a = (line2.getY2() - line2.getY1()) / (line2.getX2() - line2.getX1());
            
            return new Point2D.Double(line1.getX1(), a * (line1.getX1() - line2.getX1()) + line2.getY1());
        }
        else if(line2.getX1() == line2.getX2()) {
            double a = (line1.getY2() - line1.getY1()) / (line1.getX2() - line1.getX1());
            
            return new Point2D.Double(line2.getX1(), a * (line2.getX1() - line1.getX1()) + line1.getY1());
        }
        else {
            double a1 = (line1.getY2() - line1.getY1()) / (line1.getX2() - line1.getX1());
            double a2 = (line2.getY2() - line2.getY1()) / (line2.getX2() - line2.getX1());
            double b1 = -a1 * line1.getX1() + line1.getY1();
            double b2 = -a2 * line2.getX1() + line2.getY1();
            
            double x = (b2 - b1) / (a1 - a2);
            double y = a1 * x + b1;
            
            return new Point2D.Double(x, y);
        }
    }
}
