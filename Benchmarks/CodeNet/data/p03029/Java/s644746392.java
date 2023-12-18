import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int p = in.nextInt();
		System.out.println(solve(a, p));
		in.close();
	}

	private static int solve(int a, int p) {
		return (a * 3 + p) / 2;
	}
}