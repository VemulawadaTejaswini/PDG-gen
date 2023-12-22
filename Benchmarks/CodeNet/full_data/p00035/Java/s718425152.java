import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	double[] data = new double[8];
	String[] input;
	while (scan.hasNext()) {
	    input = scan.nextLine().split(",");
	    for (int i = 0; i < 8; i++) {
		data[i] = Double.parseDouble(input[i]);
	    }
	    if (isConvex(data)) {
		System.out.println("NO");
	    } else {
		System.out.println("YES");
	    }
	}
    }
    static boolean isConvex (double[] data) {
	double xa = data[0];
	double ya = data[1];
	double xb = data[2];
	double yb = data[3];
	double xc = data[4];
	double yc = data[5];
	double xd = data[6];
	double yd = data[7];
	double s1 = ((xd - xb) * (ya - yb) - (yd - yb) * (xa - xb)) / 2;
	double s2 = ((xd - xb) * (yc - yb) - (yd - yb) * (xc - xb)) / 2;
	double xm = xa + (xc - xa) * s1 / (s1 + s2);
	double ym = ya + (yc - ya) * s1 / (s1 + s2);
	if ((xa - xc) * (xa - xc) + (ya - yc) * (ya - yc) < (xa - xm) * (xa - xm) + (ya - ym) * (ya - ym)) {
	    return false;
	}
	if ((xb - xd) + (xb - xd) + (yb - yd) * (yb - yd) < (xb - xm) * (xb - xm) + (yb - ym) * (yb - ym)) {
	    return false;
	}
	return true;
    }
}