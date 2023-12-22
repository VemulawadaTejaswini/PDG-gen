import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, C;
		double S, L, h;
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.next()); b = Integer.parseInt(sc.next());
		C = Integer.parseInt(sc.next()); sc.close();
		S = a * b * Math.sin(Math.toRadians(C)) / 2;
		L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
		h = b * Math.sin(Math.toRadians(C));
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}