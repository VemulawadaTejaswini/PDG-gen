import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		double A = keyboard.nextDouble();
		double B = keyboard.nextDouble();
		int H = keyboard.nextInt();
		int M = keyboard.nextInt();
		
		double h = H*30 + M*0.5; 
		double m = M*6;
		
		
		System.out.println(Math.sqrt(A*A+B*B-2*A*B*Math.cos(Math.toRadians(h-m))));
		keyboard.close();
	}
}
