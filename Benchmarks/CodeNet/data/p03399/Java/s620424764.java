import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int m = min(a, b);
		int n = min(x, y);

		System.out.println(m+n);
	}

	public static int min (int a, int b) {
		if (b<a)
			a=b;

		return a;
	}
}
