import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  L = sc.nextInt();
		double a = L/3;
		double S = a*a*a;
		System.out.println((int)S);
	}

}
