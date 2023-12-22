import java.util.*;
import java.util.regex.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[\r\n]+");
		
		while (true) {
			String s = sc.next();
			if (s.equals("END OF INPUT")) {
				break;
			}
			Matcher m = Pattern.compile("\\w+").matcher(s);
			
			while (m.find()) {
				System.out.print(m.group().length());
			}
			System.out.println("");
			
		}
	}

}