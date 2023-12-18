

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();

        //System.out.println("No");
        

	    if (n<105) {
	    	System.out.print(0);
	    }else if(n<165){
	    	System.out.print(1);
	    }else if(n<195) {
	    	System.out.print(2);
	    } else {
	    	System.out.print(3);
	    }



	}
	
	public static int s(int n) {
		String S=String.valueOf(n);
		int c=0;
		for (int i=0; i<S.length();i++) {
			int k=Integer.parseInt(S.substring(i, i+1));
			c+=k;
		}
		return c;
	}

	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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