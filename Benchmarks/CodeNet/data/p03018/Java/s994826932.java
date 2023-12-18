import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String str = s.next();

			Pattern p = Pattern.compile("((A)+)((BC)+)");
			int ret = 0;
			while (str.indexOf("ABC") >= 0) {
				//System.err.println(str);
				Matcher m = p.matcher(str);
				m.find();
				int a = m.group(1).length();
				int bc = m.group(3).length() / 2;
				ret += a + bc - 1;
				StringBuilder asb = new StringBuilder(a);
				for (int i = 0; i < a; i++) {
					asb.append("A");
				}
				StringBuilder bcsb = new StringBuilder(bc * 2);
				for (int i = 0; i < bc; i++) {
					bcsb.append("BC");
				}
				str = str.replaceFirst(new StringBuilder(asb).append(bcsb).toString(),
						new StringBuilder(bcsb).append(asb).toString());
			}
			System.out.println(ret);
		}
	}
}
