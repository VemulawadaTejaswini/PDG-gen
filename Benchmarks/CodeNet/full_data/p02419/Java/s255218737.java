import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next().toLowerCase();
		sc.useDelimiter("END_OF_TEXT");
		String T = sc.next().toLowerCase();

		Pattern p = Pattern.compile(W);

		Matcher m = p.matcher(T);
		int count = 0;
		while (m.find()) {
			count++;
		}
		System.out.println(count);
	}

}