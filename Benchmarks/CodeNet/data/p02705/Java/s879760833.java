import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		System.out.println(Math.PI * n * 2);
		stdIn.close();
	}

}