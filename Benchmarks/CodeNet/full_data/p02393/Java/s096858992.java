import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int t;

		if (a > b) {
			t = a;
			a = b;
			b = t;
		} 
		
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		
		if (c > a) {
			t = c;
			c = a;
			a = t;
		}
		
		System.out.println(a + " " + b + " " + c);
	}

}

