import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		if ((n / 100) == (n % 10)) System.out.println("Yes");
		else System.out.println("No");
	}
}