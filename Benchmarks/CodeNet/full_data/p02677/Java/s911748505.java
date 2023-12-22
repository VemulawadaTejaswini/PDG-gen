import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		double Ax;
		double Ay;
		double Bx;
		double By;
		
		double AB;
		
		//AB = Math.sqrt(A*+B*B-2*A*B*Math.cos(Math.toRadians(30*H-6*M)));
		
		Ax = A*Math.cos(Math.toRadians(30*H));
		Ay = A*Math.sin(Math.toRadians(30*H));
		Bx = B*Math.cos(Math.toRadians(6*M));
		By = B*Math.sin(Math.toRadians(6*M));
		
		AB = Math.sqrt(Math.pow(Ax-Bx, 2)+Math.pow(Ay-By, 2));
			
		System.out.println(AB);


	}

}