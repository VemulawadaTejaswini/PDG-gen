import java.util.*;
public class Main {

	public static void main(String[] args) {
			Scanner cin = new Scanner(System.in);
			double r;
			r=cin.nextDouble();
			System.out.print(String.format("%.5f %.5f",r*r*3.14159,2*r*3.14159));
	}
}