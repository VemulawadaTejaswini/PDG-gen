import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double menseki =(double)r*(double)r*3.14159265,enshu =(double)r*(double)2*3.14159265;
		System.out.printf("%f %f\n",menseki,enshu);
	}
}