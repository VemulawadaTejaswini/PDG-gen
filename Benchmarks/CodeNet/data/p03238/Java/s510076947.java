import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n==1) {
			System.out.println("Hello World");
			return;
		}
		else {
			System.out.println(scanner.nextInt()+scanner.nextInt());
		}
	}
}
