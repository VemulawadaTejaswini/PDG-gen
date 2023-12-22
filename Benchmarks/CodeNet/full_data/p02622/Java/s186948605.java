import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		String t = in.next();
		int r = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != t.charAt(i))
				r++;
		System.out.println(r);
	}
}