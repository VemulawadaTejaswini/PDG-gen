import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double pi = Math.PI;
		double r = sc.nextDouble();
		
		System.out.println(2 * pi * r);
		System.out.println(r * r * pi);
		sc.close();
	}
}
