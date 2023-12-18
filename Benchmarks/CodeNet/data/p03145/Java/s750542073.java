import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		int max = max (a, b, c);
		int prod = 1;
		if (a != max) {
			prod *= a;
		} 
		if (b!=max) {
			prod *= b;
		}
		if (c != max) {
			prod *= c;
		}

		System.out.println(prod/2);
	}

	public static int max (int a, int b, int c) {
		int max = a;
		if (b > a) {
			max = b;
		}
		if (c > b) {
			max = c;
		}

		return max;
	}
}
