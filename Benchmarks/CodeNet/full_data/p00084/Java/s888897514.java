import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Pattern pt = Pattern.compile("([ \\.\\,]|^)([a-zA-Z']{3,6})[ \\.\\,]");
		Matcher mc = pt.matcher(new Scanner(System.in).nextLine());
		boolean isF = true;
		while (mc.find()) {
			if (!isF) {
				System.out.print(' ');
			}
			isF = false;
			System.out.print(mc.group(2));
		}
		System.out.println();
	}
}