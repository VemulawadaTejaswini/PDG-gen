import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();

		int a = y / 2 - x;
		int b = x - a;

		if (a < 0 || b < 0 || x%2 == 1 | y%2 == 1)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}

