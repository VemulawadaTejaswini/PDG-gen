import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    double r = std.nextDouble();
	    double s = r * r * Math.PI;
	    double l = 2 * r * Math.PI;
	    System.out.println(s+" "+l);
	}
}