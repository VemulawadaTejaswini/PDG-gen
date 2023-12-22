
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt();

		System.out.print(a*b + " " + (2*a+2*b) + "\n");
		scan.close();
	}

}

