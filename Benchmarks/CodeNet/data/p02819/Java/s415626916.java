

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int X=gi();

	    while(true) {
	    	boolean flg=true;
	        for (int i=2; i<Math.floorDiv(X, 2);i++) {
	        	if(X%i==0) {
	        		flg=false;
	        		break;
	        	}
	        }
	        if(flg)break;
	        X++;
	    }

        System.out.print(X);
//        if (s.charAt(0)=='0' && N!=1) {
//        	System.out.println(-1);
//        }else {
//        	System.out.println(s);
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