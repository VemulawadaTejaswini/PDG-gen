import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		solve(s);
	}

	private static void solve(String s) {
		int lenR = 0;
		int lenL = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R')
				lenR++;
			else
				lenL++;
			if (i < s.length() - 1)
				if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'R') {
					printSolve(lenR, lenL);
					lenR = 0;
					lenL = 0;
				}
		}
		printSolve(lenR, lenL);
		System.out.println();
	}

	private static void printSolve(int lenR, int lenL) {
		for (int i = 1; i < lenR; i++)
			System.out.print("0 ");
		System.out.print((lenR - (lenR / 2) + (lenL / 2)) + " " + ((lenR / 2) + lenL - (lenL / 2)) + " ");
		for (int i = 1; i < lenL; i++)
			System.out.print("0 ");
	}
}
