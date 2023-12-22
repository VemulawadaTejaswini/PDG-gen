import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			double r = sc.nextDouble();
			System.out.println(String.format("%f %f", r*r*Math.PI, 2*r*Math.PI));
		}
	}
}
