import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double d1 	= sc.nextInt();
		double d2 	= sc.nextInt();
		double d	= d1 + d2;

		int n = Double.toString(d).indexOf('.');

		System.out.println(n);
	}
}