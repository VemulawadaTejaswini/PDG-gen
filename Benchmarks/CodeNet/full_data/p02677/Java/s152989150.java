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
		
		//AB = Math.sqrt(A*A+B*B-2*A*B*Math.cos(Math.toRadians(15*H-6*M)));
		
		Ax = Math.cos(Math.toRadians(30*H));
		Ay = Math.sin(Math.toRadians(30*H));
		Bx = Math.cos(Math.toRadians(6*M));
		By = Math.sin(Math.toRadians(6*M));
		
		AB = Math.sqrt(A*A*((Ax-Bx)*(Ax-Bx))+B*B*(((Ay-By)*(Ay-By))));
			
		System.out.println(AB);


	}

}