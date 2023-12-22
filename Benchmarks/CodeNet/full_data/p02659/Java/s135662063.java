import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextInt();
		double B = sc.nextDouble();
		
		double seki = A*B;
		
		System.out.println((long)seki);
		
	}
}