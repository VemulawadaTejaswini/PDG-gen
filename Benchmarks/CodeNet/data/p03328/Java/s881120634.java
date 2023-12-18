
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int difference = b - a;
		int heightB = 0;
		for (int i = 1; i <= difference; i++) {
			heightB += i;
		}
		System.out.println(heightB - b);
		
	}
}