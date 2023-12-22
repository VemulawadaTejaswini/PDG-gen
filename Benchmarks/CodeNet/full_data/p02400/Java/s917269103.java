import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		final double Pl = 3.1416;
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		
		System.out.println(2*Pl*r);
		System.out.println(Pl*r*r);
	}

}
