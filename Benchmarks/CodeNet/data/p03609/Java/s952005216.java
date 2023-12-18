import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int t = sc.nextInt();
		
		System.out.println(Math.max(X - t, 0));
		
	}
}

