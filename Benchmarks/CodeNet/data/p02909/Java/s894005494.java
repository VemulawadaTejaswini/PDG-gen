import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		String[] w = {"Sunny", "Cloudy", "Rainy"};
		String s = sc.next();
		
		if (s.equals(w[0])) {
			pr.println(w[1]);
		} else if (s.equals(w[1])) {
			pr.println(w[2]);
		} else {
			pr.println(w[0]);
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
