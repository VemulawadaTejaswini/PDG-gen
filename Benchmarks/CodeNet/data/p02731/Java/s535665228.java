import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		
		double X = L * L * L /9;
		
		System.out.println(X);
	}
}