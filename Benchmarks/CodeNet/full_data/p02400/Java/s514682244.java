import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long r = stdIn.nextInt();
		
		double s = r * r * Math.PI;
		double c = 2 * r * Math.PI;
		
		System.out.println(s + " " + c);
	}
}