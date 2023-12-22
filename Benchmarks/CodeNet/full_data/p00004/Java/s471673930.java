import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	double a, b, c, d, e, f;
	while (scan.hasNext()) {
	    a = scan.nextDouble();
	    b = scan.nextDouble();
	    c = scan.nextDouble();
	    d = scan.nextDouble();
	    e = scan.nextDouble();
	    f = scan.nextDouble();
	    solveSimultaneousEquation(a, b, c, d, e, f);
	    scan.nextLine();
	}
    }
    static void solveSimultaneousEquation (double a, double b, double c, double d, double e, double f) {
	double dx = d / a;
	double cx = c * dx - f;
	double dy = b * dx - e;
	double y = cx / dy;
	double x = (c - b * y) / a;
	System.out.println(x + " " + y);
    }
}