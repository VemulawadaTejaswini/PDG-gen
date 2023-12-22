import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double r = scn.nextDouble();
		System.out.println(String.format("%f %f", r * r * Math.PI, 2 * r * Math.PI));
	}
}