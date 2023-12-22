import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double r = in.nextDouble();
		
		System.out.print(Math.pow(r, 2)*Math.PI);
		System.out.print(" ");
		System.out.print(2*Math.PI*r);
		System.out.println();
	}
}