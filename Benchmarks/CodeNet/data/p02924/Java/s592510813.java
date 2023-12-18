import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		solve(n);
		in.close();
	}

	private static void solve(long n) {
		System.out.println(n * (n - 1) / 2);
	}
}
