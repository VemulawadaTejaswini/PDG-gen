import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		int c = a + b;
		
		if(a % 3 == 0 || b % 3 == 0 || c % 3 == 0)
			System.out.println("Possible");
		else
			System.out.println("Imposible");
	}	
}
