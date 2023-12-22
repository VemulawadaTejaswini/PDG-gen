import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double p = 3.1415926;
		double r;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		System.out.println(p*r*r + " " + 2*p*r);
	}

}