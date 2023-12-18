import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
	public static boolean hantei(String str) {
        return Pattern.matches("^[a-z]+$", str);
    }
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S;
		String T;
		do {
			S = stdIn.next();
			T = stdIn.next();
		}while(hantei(S)==false||hantei(T)==false||S.length()<1||S.length()>100||T.length()<1||T.length()>100);
		System.out.println(T+S);
	}
}
