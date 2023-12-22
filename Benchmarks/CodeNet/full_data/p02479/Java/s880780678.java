import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		double are = r * r * Math.PI;
		double circ = r * 2 * Math.PI;
		System.out.printf("%f %f",are,circ);
	}
}