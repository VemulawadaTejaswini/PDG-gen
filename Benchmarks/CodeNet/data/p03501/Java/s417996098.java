import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = a * b;
		
		if (d >= c) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}
	}
}