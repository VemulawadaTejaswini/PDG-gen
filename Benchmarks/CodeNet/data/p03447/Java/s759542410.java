import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		x = x-a;
		while (x-b>=0) {
			x = x - b;
		}
		System.out.println(x);
	}
}
