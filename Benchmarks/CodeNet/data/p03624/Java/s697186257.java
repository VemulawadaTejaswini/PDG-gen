
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final boolean[] notFound;

    public Main() {
	notFound = new boolean[26];
	Arrays.fill(notFound, true);
	
	String S = scan.next();
	for (int i = 0; i < S.length(); i++) {
	    notFound[S.charAt(i) - 'a'] = false;
	}

	scan.close();
    }

    public final void answer() {

	String ans = "None";
	for (int i = 0; i < notFound.length; i++) {
	    if(notFound[i]) {
		ans = String.valueOf((char)('a' + i));
		break;
	    }
	}
	System.out.println(ans);
    }
}
