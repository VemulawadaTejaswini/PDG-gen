import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		double h = Double.parseDouble(sc.next());
		double m = Double.parseDouble(sc.next());
		double hour = 30*(h%12) + (30*(m /60));
		double min = 6*m;
	
		double  radianA = hour * Math.PI / 180;
		double y1 = Math.sin(radianA) * a;
		double x1 = Math.cos(radianA) * a;

		double  radianB = min * Math.PI / 180;
		double y2 = Math.sin(radianB) * b;
		double x2 = Math.cos(radianB) * b;

	    double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

	    System.out.println(distance);
	}
}
