import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = a + b;
		
		if (c <= 23) { 
			System.out.println(c);
		} else {
			System.out.println(c-24);
		}
	}
}