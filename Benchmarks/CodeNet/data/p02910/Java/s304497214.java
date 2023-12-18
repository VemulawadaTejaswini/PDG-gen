
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    
	    for(int i=0; i<S.length(); i++) {
	    	char c=S.charAt(i);
	    	if (i%2==0 && c=='L') {
	    		System.out.print("No");
	    		return;
	    	}
	    	if (i%2==1 && c=='R') {
	    		System.out.print("No");
	    		return;
	    	}
	    }

        System.out.print("Yes");
//        if (c<=2) {
//        	System.out.println("YES");
//        }else {
//        	System.out.println("NO");
//        }
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