import java.util.Scanner;

//ACならず。いちぶWA。悔しい。

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
		double sita = (60*H+M)/2-6*M;
		
		if(sita>180) {
			sita = sita -180;
		}
		if(sita<0) {
			sita = -sita;
			if(sita>180) {
				sita = sita -180;
			}
			
		}
				
		

		AB = Math.sqrt(A*A+B*B-2*A*B*Math.cos(Math.toRadians((60*H+M)/2-6*M)));

	/*	Ax = A*Math.cos(Math.toRadians((60*H+M)/2));
		Ay = A*Math.sin(Math.toRadians((60*H+M)/2));
		Bx = B*Math.cos(Math.toRadians(6*M));
		By = B*Math.sin(Math.toRadians(6*M));

		AB = Math.sqrt(Math.pow(Ax-Bx, 2)+Math.pow(Ay-By, 2));
	 */
		System.out.println(AB);


	}

}