
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Pattern p = Pattern.compile("[ATCG]+");
		Matcher m = p.matcher(s);
		int length = m.results()
				.map(MatchResult::group)
				.mapToInt(String::length)
				.max()
				.orElse(0);
		System.out.println(length);
	}
}