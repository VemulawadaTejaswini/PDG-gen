import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
	    double r = sc.nextDouble();
	    System.out.printf("%f %f\n", areaOfCircle(r), lengthOfCircumference(r));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    private static double areaOfCircle(Double r) {
	return Math.pow(r, 2) * Math.PI;
    }

    private static double lengthOfCircumference(Double r) {
	return 2 * Math.PI * r;
    }
}