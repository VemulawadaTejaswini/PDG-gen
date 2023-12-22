import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	double[] p = new double[6]; // x1, x2, x3, y1, y2, y3

	for (int i=0; i<n; i++) {
	    
	    for (int j=0; j<6; j++) {
	        p[j] = scan.nextDouble();
	    }

	    double a = p[0] - p[1], b = p[3] - p[4], c = p[1] - p[2],
		d = p[4] - p[5], e = (p[0]*p[0])+(p[3]*p[3])-(p[1]*p[1])-(p[4]*p[4]),
		f = (p[1]*p[1])+(p[4]*p[4])-(p[2]*p[2])-(p[5]*p[5]);

	    double x = (d*e - b*f) / (2*(a*d - b*c));
	    double y = (e - 2*a*x) / (2*b);
	    double dx = x - p[0], dy = y - p[3];
	    double r = Math.sqrt((dx*dx) + (dy*dy));

	    x = Math.round(1000 * x);
	    y = Math.round(1000 * y);
	    r = Math.round(1000 * r);

	    x = x / 1000;
	    y = y / 1000;
	    r = r / 1000;

	    System.out.printf("%.3f %.3f %.3f\n", x, y, r);
	}
    }
}