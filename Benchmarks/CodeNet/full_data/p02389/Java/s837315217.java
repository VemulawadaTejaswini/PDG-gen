import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int menseki = a * b;
		int syu = a * a + b * b;
		
		System.out.println(menseki);
		 
	}
}