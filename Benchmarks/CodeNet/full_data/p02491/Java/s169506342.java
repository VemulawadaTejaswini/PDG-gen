import java.util.Scanner;

public class Main {
	private static Scanner stdIn;

	public static void main(String[] args){
		stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		System.out.print((int)a/b + " " + (int)a%b + " " + (double)a/b);
	}
}