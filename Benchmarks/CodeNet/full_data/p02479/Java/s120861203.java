import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc 	= new Scanner(System.in);
		double r	= sc.nextDouble();
		double s	= Math.PI * Math.pow(r, 2);
		double l	= Math.PI * 2*r;
		System.out.println((float)s + " " + (float)l);
	}
}