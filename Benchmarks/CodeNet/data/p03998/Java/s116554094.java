
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	String SA = scan.next();
	String SB = scan.next();
	String SC = scan.next();

	int sa = 0;
	int sb = 0;
	int sc = 0;
	char next = 'a';
	boolean flag = true;
	char winner = 0;
	while(flag) {
	    switch(next) {
		case 'a':
		    sa++;
		    if(sa == SA.length()) {
			flag = false;
			winner = 'A';
		    } else next = SA.charAt(sa);
		    break;
		case 'b':
		    sb++;
		    if(sb == SB.length()) {
			flag = false;
			winner = 'B';
		    }
		    else next = SB.charAt(sb);
		    break;
		case 'c':
		    sc++;
		    if(sc == SC.length()) {
			flag = false;
			winner = 'C';
		    }
		    else next = SC.charAt(sc);
		    break;
	    }
	}

	System.out.println(winner);
	scan.close();
    }
}
