import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		String t = scan.next();
		String p = scan.next();

		nFind(t, p);

		scan.close();
		System.exit(0);
	}

	private static void nFind(String t, String p) {
		for (int st = 0; st < t.length() - p.length() + 1; st++)
			if (isEqual(t, p, st))
				System.out.println(st);
	}

	private static boolean isEqual(String t, String p, int st) {
		for (int i = 0; i < p.length(); i++)
			if (t.charAt(i + st) != p.charAt(i))
				return false;
		return true;
	}

}