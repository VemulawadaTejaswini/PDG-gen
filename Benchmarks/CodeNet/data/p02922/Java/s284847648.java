import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		if ( b % a != 0 ) System.out.println(b / a + 1);
		else System.out.println(b / a);

		in.close();
	}
}