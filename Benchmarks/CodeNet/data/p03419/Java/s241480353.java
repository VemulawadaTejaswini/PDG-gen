

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long N=gi();
	    long M=gi();
        
	    if(N==1 && M==1) {
	    	System.out.print(1);
	    } else if(N==1){
	    	System.out.print(M-2);
	    } else if(M==1) {
	    	System.out.print(N-2);
	    } else {
	    	System.out.print((M-2)*(N-2));
	    }



	    //System.out.print(max);
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