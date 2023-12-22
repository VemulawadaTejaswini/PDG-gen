import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		double x =Math.PI;
		double l = 2 * r * x;
		double c = r * r * x;
		String n = String.format("%.6f", l);
		String m = String.format("%.6f", c);
		System.out.println(l+" "+c);
		
	}

}