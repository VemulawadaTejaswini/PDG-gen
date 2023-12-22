import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] Array = a.split("");
		
		String b ="";
		String c="";
		Pattern p1 = Pattern.compile("[a-z]");
		Pattern p2 = Pattern.compile("[A-Z]");
		for (int i = 0; i < a.length(); i++) {

			Matcher m1 = p1.matcher(Array[i]);
			Matcher m2 = p2.matcher(Array[i]);

			if (m1.find()) {
				c=Array[i].toUpperCase();
				System.out.print(c);
			}else if (m2.find()) {
				b=Array[i].toLowerCase();
				System.out.print(b);
			} else {
				System.out.print(Array[i]);
			}

		}
	}
}

