import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a <= 5) {
			pr.println(0);
		} else if (a <= 12) {
			pr.println(b / 2);
		} else {
			pr.println(b);
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
