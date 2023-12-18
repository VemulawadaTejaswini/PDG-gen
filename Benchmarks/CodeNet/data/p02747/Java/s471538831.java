import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    char[] s = S.toCharArray();

	    boolean flg = false;
	    for (int i = 1; i < s.length; i++) {
	    	if (s[i-1] == 'h' && s[i] == 'i') {
	    		flg = true;
	    		break;
	    	}
	    }

	    if (flg) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	}

}