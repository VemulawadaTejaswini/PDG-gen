
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    boolean n=false;
	    boolean e=false;
	    boolean w=false;
	    boolean s=false;
	    
	    for (int i=0; i<S.length();i++) {
	    	char c=S.charAt(i);
	    	if(c=='N') {
	    		n=true;
	    	} else if(c=='E') {
	    		e=true;
	    	} else if(c=='W') {
	    		w=true;
	    	} else if(c=='S') {
	    		s=true;
	    	} 
	    }

	    //System.out.println(min);
        if ((n && !s) || (!n && s) || (e && !w) || (!e && w)) {
    	    System.out.print("No");
        }else {
        	System.out.print("Yes");
        }
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}