import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		
		System.out.println(Pattern.compile("[A-Z]").matcher(c).matches() ? "A":"a");
	}
}
