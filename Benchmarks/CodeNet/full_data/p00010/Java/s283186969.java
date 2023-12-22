import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	double[] p = new double[6];

	for (int i=0; i<n; i++) {
	    
	    for (int j=0; j<6; j++) {
	        p[j] = scan.nextDouble();
	    }

	    double a = p[0] - p[2], b = p[1] - p[3], c = p[2] - p[4],
		d = p[3] - p[5], e = (p[0]*p[0])+(p[1]*p[1])-(p[2]*p[2])-(p[3]*p[3]),
		f = (p[2]*p[2])+(p[3]*p[3])-(p[4]*p[4])-(p[5]*p[5]);

	    double x = (d*e - b*f) / (2*(a*d - b*c));
	    double y = (e - 2*a*x) / (2*b);
	    double dx = x - p[0], dy = y - p[1];
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