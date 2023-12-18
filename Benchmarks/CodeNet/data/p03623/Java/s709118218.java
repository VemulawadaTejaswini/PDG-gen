
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println((int)Math.abs(x - a) < (int)Math.abs(x - b) ? "A" : "B");
		scan.close();

	}

}
