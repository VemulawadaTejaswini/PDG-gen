
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	String s1 = scan.next();
	String s2 = scan.next();

	String ans = "EQUAL";
	if(s1.length() > s2.length()) ans = "GREATER";
	else if(s1.length() < s2.length()) ans = "LESS";
	else {
	    for (int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i) > s2.charAt(i)) ans = "GREATER";
		else if(s1.charAt(i) < s2.charAt(i)) ans = "LESS";
	    }
	}

	System.out.println(ans);
	scan.close();
    }
}
