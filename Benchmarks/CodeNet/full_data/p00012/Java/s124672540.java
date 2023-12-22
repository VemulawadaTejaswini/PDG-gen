import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	Coordinate A, B, C, P, AB, BP, BC, CP, CA, AP;
	double x1, x2, x3, y1, y2, y3, xp, yp, c1, c2, c3;
	String[] input;
	while (scan.hasNext()) {
	    input = scan.nextLine().split(" ");
	    x1 = Double.parseDouble(input[0]);
	    y1 = Double.parseDouble(input[1]);
	    x2 = Double.parseDouble(input[2]);
	    y2 = Double.parseDouble(input[3]);
	    x3 = Double.parseDouble(input[4]);
	    y3 = Double.parseDouble(input[5]);
	    xp = Double.parseDouble(input[6]);
	    yp = Double.parseDouble(input[7]);
	    A = new Coordinate(x1, y1);
	    B = new Coordinate(x2, y2);
	    C = new Coordinate(x3, y3);
	    P = new Coordinate(xp, yp);
	    AB = sub(B, A);
	    BP = sub(P, B);
	    BC = sub(C, B);
	    CP = sub(P, C);
	    CA = sub(A, C);
	    AP = sub(P, A);
	    c1 = AB.x * BP.y - AB.y * BP.x;
	    c2 = BC.x * CP.y - BC.y * CP.x;
	    c3 = CA.x * AP.y - CA.y * AP.x;
	    if ((c1 < 0 && c2 < 0 && c3 < 0) || (c1 > 0 && c2 > 0 && c3 > 0)) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}
    }
    static Coordinate sub (Coordinate a, Coordinate b) {
	return new Coordinate(a.x - b.x, a.y - b.y);
    }
}
class Coordinate {
    double x;
    double y;
    Coordinate (double x, double y) {
	this.x = x;
	this.y = y;
    }
}