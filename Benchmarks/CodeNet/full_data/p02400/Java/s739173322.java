import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double r=in.nextDouble();
		System.out.println(String.format("%.6f %.6f",r*r*Math.PI,Math.PI*r*2));
	}
}