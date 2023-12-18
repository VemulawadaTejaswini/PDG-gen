import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		Pattern pattern = Pattern.compile("^[a-z]+$");
		
		boolean isClear = true;
		for (int i = 0; i < 2; i++) {
			String s = i == 0 ? str : str2;
			Matcher m = pattern.matcher(s);
			if (!m.find() || s.length() < 1 || s.length() > 100) {
				isClear = false;
				break;
			}
		}
		if (isClear) {
			System.out.println(str2 + str);
		}
	}

}