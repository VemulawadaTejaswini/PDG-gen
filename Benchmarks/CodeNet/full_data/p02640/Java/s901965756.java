import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();


		for (int a=0; a<=x; a++) {
			int b = x - a;
			if (2*a + 4*b == y) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}

