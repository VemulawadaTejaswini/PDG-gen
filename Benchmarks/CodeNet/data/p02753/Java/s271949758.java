import java.util.Scanner;

class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    char[] s = new char[3];

	    for (int i = 0; i < 3; i++) {
	    	s[i] = S.charAt(i);
	    }

	    if (s[0] == s[1] && s[0] == s[2]) {
	    	System.out.println("No");
	    } else {
	    	System.out.println("Yes");
	    }
	}
}