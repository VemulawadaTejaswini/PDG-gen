import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		double x = Math.PI;
		double a,b;
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		
		
		a = x*r*r;
		System.out.print(a);
		String.format("%.2f",a);
		
		System.out.print(" ");
		b = 2*x*r;
		System.out.print(2*x*r);
		String.format("%.2f",b);
	}
}

