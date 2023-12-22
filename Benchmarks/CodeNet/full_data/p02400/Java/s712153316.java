import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double menseki =r*r*3.14159265358,enshu =r*2*3.14159265358;
		System.out.printf("%.6f %.6f\n",menseki,enshu);
	}
}