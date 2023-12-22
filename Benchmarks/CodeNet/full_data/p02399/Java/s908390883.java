import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		long one = a / b;
		long two = a % b;

float x = a;
float y = b;

		float three = x / y;
		
		System.out.println(one + " " + two + " " + three);

		
				
	}
}

