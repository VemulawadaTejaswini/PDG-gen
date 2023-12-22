import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		abProblem();

	}
	
	public static void abProblem() {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a / b + " " + a % b + " " + String.format("%.8f", (double) a / b));
	}
}
