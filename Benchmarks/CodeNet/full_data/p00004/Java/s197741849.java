import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
	    int a, b, c, d, e, f;
	    float x, y;
	    Scanner s = new Scanner(System.in);
	    a = s.nextInt();
	    b = s.nextInt();
	    c = s.nextInt();
	    d = s.nextInt();
	    e = s.nextInt();
	    f = s.nextInt();
        x = (c * e - b * f) / (a * e - d * b);
        y = (c * d - a * f) / (b * d - a * e);
        System.out.printf("%.3f %.3f\n", x, y);
	}
}