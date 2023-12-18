import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int E = scanner.nextInt();
		int a = A % 10;
		if (a == 0) {
			a += 10;
		}
		int b = B % 10;
		if (b == 0) {
			b += 10;
		}
		int c = C % 10;
		if (c == 0) {
			c += 10;
		}
		int d = D % 10;
		if (d == 0) {
			d += 10;
		}
		int e = E % 10;
		if (e == 0) {
			e += 10;
		}
		int T = 0;
		int min = 100;
		int[] data = { a, b, c, d, e};
		for(int i = 0; i < data.length; i++) {
			min = Math.min(min,data[i]);
		}
		//System.out.println(min);
		T = A+B+C+D+E+40-a-b-c-d-e+min;
		System.out.println(T);
	}
}