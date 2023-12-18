
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int c=0;
	    if (N>=10) {
	    	c+=9;
	    	if (N>=1000) {
		    	c+=900;
		    	if (N>=100000) {
			    	c+=90000;
			    }else if(N>=10000){
			    	c+=N-9999;
			    }
		    }else if(N>=100) {
		    	c+=N-99;
		    }
	    }else {
	    	c+=N;
	    }
	   
        System.out.print(c);
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