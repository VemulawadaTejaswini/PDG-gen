import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		System.out.print((int)a/b + " " + (int)a%b + " " + (double)a/b);
	}
}