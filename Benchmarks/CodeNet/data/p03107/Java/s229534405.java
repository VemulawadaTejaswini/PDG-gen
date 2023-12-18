import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int count = 0;
		int lastCount = -1;
		while(lastCount != count) {
			lastCount = count;
			Pattern p = Pattern.compile("(01|10)");
			Matcher m = p.matcher(s);
			while(m.find()) {
				count+=2;
			}
			s = s.replaceAll("(01|10)", "");	
		}
		System.out.println(count);
	}
}