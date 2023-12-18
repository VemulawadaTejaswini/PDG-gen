import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	private static void core() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Pattern.matches("^(dream|dreamer|erase|eraser)*$", s) ? "YES" : "NO");
	}

	/*
	 * Scanner sc = new Scanner(System.in);
	 */

	public static void main(String[] args) {
		core();
	}

}
