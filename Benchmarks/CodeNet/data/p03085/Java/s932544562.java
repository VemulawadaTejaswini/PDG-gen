import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		char b = s.charAt(0);
		System.out.println(solve(b));
		in.close();
	}

	private static char solve(char b) {
		if (b == 'A')
			return 'T';
		else if (b == 'T')
			return 'A';
		else if (b == 'G')
			return 'C';
		else
			return 'G';
	}
}