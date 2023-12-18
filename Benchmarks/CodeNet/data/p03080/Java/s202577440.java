

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    String s=gs();
	    
	    int r=0;
	    int b=0;
	    for (int i=0; i<N;i++) {
	    	char c=s.charAt(i);
	    	if(c=='R') {
	    		r++;
	    	}else {
	    		b++;
	    	}
	    }

	    if (r>b) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	    //System.out.println(a);
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