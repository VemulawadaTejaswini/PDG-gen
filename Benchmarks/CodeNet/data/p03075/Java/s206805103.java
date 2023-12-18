import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		int k = in.nextInt();
		System.out.println(solve(a, e, k));
		in.close();
	}

	private static String solve(int a, int e, int k) {
		if (e - a > k)
			return ":(";
		else
			return "Yay!";
	}

}