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
        x = (c * e - b * f) * 10000 / (a * e - d * b);
        y = (c * d - a * f) * 10000 / (b * d - a * e);
        System.out.printf("%.3f %.3f\n", x / 10000 , y / 10000);
	}
}