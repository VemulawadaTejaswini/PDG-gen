import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int a;
		int b;
		int c;

		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		if (a < b && b < c) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}


}