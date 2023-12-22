import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

     	int r = sc.nextInt();
		
     	double A = 3.14*Math.pow(r, 2);
		double P = 2*3.14*r;
		
		System.out.printf("%5.5f %5.5f",A,P);
     	
	sc.close();
	}


}