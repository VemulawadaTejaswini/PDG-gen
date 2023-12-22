import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		double r = scan.nextDouble();

		String S = String.format("%.5f", r*r*Math.PI);
		String l = String.format("%.5f", 2*Math.PI*r);

		System.out.println(sb.append(S).append(" ").append(l));

	}

}