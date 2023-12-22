import java.util.Scanner;
import static java.lang.Math.*;

class ID0012 {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	double[] p = new double[6];
	double[] S = new double[4];

	while (scan.hasNext()) {
	    for (int i=0; i<6; i++) {
		p[i] = scan.nextDouble();
	    }

	    double xp = scan.nextDouble();
	    double yp = scan.nextDouble();

	    double a, b, c, s;
	    for (int i=0; i<6; i+=2) {
		if (i == 4) {
		    a = sqrt(pow(p[0]-p[4], 2) + pow(p[1]-p[5], 2));
		    b = sqrt(pow(xp-p[4], 2) + pow(yp-p[5], 2));
		    c = sqrt(pow(xp-p[0], 2) + pow(yp-p[1], 2));
		}
		else {
		    a = sqrt(pow(p[i+2]-p[i], 2) + pow(p[i+3]-p[i+1], 2));
		    b = sqrt(pow(xp-p[i], 2) + pow(yp-p[i+1], 2));
		    c = sqrt(pow(xp-p[i+2], 2) + pow(yp-p[i+3], 2));
		}

		s = (a+b+c) / 2.0;
		S[i/2] = (sqrt(s*(s-a)*(s-b)*(s-c)));
	    }

	    a = sqrt(pow(p[2]-p[0], 2) + pow(p[3]-p[1], 2));
	    b = sqrt(pow(p[4]-p[2], 2) + pow(p[5]-p[3], 2));
	    c = sqrt(pow(p[0]-p[4], 2) + pow(p[1]-p[5], 2));
	    s = (a+b+c) / 2.0;
	    S[3] = (sqrt(s*(s-a)*(s-b)*(s-c)));

	    if (round(S[3]) == round(S[0] + S[1] + S[2])) {
		System.out.println("YES");
	    }
	    else {
		System.out.println("NO");
	    }
	}
    }
}