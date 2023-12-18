import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		Pattern pattern = Pattern.compile("^A[a-z]+C[a-z]+$");
		Matcher matcer = pattern.matcher(str);
		if(matcer.find()) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
		
	}

}