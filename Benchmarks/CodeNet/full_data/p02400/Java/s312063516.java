import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		double x = Math.PI;
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		
		System.out.print( x*r*r);
		System.out.print(" ");
		System.out.print(2*x*r);
		
	}

}
