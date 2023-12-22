import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		double r = scan.nextDouble();
		double area = r * r * Math.PI;
		double cir = 2 * r * Math.PI;
		System.out.printf("%f %f\n", area, cir);
	}
}