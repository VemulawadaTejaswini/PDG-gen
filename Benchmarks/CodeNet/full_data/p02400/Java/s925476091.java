import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	double r = in.nextDouble();
    	double l = r * 2 * Math.PI;
    	double s = r*r * Math.PI;
    	System.out.printf("%.6f %.6f",s,l);
	}
}