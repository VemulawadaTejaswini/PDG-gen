import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (int i=(int)(Math.sqrt(a)); i>=1; i--) {
			if (a%i == 0) {
				//System.out.println(i + a/i - 2);
				System.out.println(100);
				System.exit(0);
			}
		}
		System.out.println(a - 1);
	}
}

