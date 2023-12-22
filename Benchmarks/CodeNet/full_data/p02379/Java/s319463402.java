import java.util.Scanner;
import java.awt.geom.Point2D;
import java.text.DecimalFormat;
class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()){
			DecimalFormat frt = new DecimalFormat("0.0000000");
			Point2D.Double point = new Point2D.Double();
			System.out.println(frt.format(point.distance(sc.nextFloat(), sc.nextFloat(),sc.nextFloat(),sc.nextFloat())));
		}
	}
}