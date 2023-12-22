import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intA = scan.nextInt();
		int intB = scan.nextInt();
		int d = intA / intB;
		int r = intA % intB;
		double f = (intA/(double)intB);
		System.out.println(d + " " + r + " " + f);
	}
}