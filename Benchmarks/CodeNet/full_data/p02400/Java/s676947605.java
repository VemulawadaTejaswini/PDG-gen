import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double x = stdIn.nextDouble();
        stdIn.close();
        System.out.printf("%.6f %.6f%n", x*x*Math.PI,2*x*Math.PI);
	}
}

