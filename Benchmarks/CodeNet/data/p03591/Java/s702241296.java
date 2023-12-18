
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		String s = inPut.nextLine();

		String pattern = "^YAKI.*";
		boolean isMatch = Pattern.matches(pattern, s);
		if(isMatch==true ){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}

}
