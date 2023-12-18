import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a * b) % 2 != 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}