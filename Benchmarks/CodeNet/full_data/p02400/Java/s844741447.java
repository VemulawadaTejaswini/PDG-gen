import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		double r = scan.nextDouble();

		sb.append(r*r*Math.PI).append(2*Math.PI*r);

	}

}