import java.util.Scanner;

//ACならず。いちぶWA。悔しい。

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double H = scan.nextDouble();
		double M = scan.nextDouble();
		

		double Ax;
		double Ay;
		double Bx;
		double By;
		double AB;
		double AB2;
		double sita = H/12+M/60/12-M/60;
		//System.out.println(H/12);
		//System.out.println(M/60/12);
		//System.out.println(M/60);
		double sita2;
		
		/*
		if(sita>180) {
			sita = sita -180;
		}
		if(sita<0) {
			sita = -sita;
			if(sita>180) {
				sita = sita -180;
			}
			
		}
		*/
		
				
		//System.out.println(sita);

		//AB = Math.sqrt(A*A+B*B-2*A*B*Math.cos(Math.toRadians(sita)));
		AB = Math.sqrt(A*A+B*B-2*A*B*Math.cos(2*Math.PI*sita));
	/*	System.out.println(2*Math.PI*sita);
		System.out.println(A*A+B*B-2*A*B*Math.cos(2*Math.PI*sita));


		Ax = A*Math.cos(Math.toRadians((60*H+M)/2));
		Ay = A*Math.sin(Math.toRadians((60*H+M)/2));
		Bx = B*Math.cos(Math.toRadians(6*M));
		By = B*Math.sin(Math.toRadians(6*M));

		AB2 = Math.sqrt(Math.pow(Ax-Bx, 2)+Math.pow(Ay-By, 2));
	 */
		System.out.println(AB);
		//System.out.println(AB2);


	}

}
