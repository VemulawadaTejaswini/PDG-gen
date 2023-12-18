import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int a_x = a - x;
		int b_x = b - x;
		if(a_x < 0) {
			a_x = a_x * (-1);
		}
		if(b_x < 0) {
			b_x = b_x * (-1);
		}
		if(a_x < b_x) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}