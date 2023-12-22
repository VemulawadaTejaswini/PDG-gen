import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	String p = scan.nextLine();
	if (match(s, p)) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
    public static boolean match (String s, String p) {
	int pLength = p.length();
	String doubleS = s + s;
	for (int i = 0; i < s.length(); i++) {
	    String word = doubleS.substring(i, i+pLength);
	    if (word.equals(p)) {
		return true;
	    }
	}
	return false;
    }
}