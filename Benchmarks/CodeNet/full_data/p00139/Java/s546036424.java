
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Pattern a = Pattern.compile(">'(=+)#\\1~");
		Pattern b = Pattern.compile(">\\^(Q=)+~~");
		while (n-- > 0) {
			String line = scanner.next();
			Matcher ma = a.matcher(line);
			Matcher mb = b.matcher(line);
			if (ma.matches())
				System.out.println("A");
			else if (mb.matches())
				System.out.println("B");
			else
				System.out.println("NA");
		}
	}
}