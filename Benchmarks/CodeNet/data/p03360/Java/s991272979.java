
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int a=gi();
        int b=gi();
        int c=gi();
        int k=gi();
        
        if(a>=b && a>=c) {
        	System.out.println((int)(b+c+Math.pow(2, k)*a));
        }else if(b>=a && b>=c) {
        	System.out.println((int)(a+c+Math.pow(2, k)*b));
        }else if(c>=b && c>=a) {
        	System.out.println((int)(b+a+Math.pow(2, k)*c));
        }


	    //System.out.println(k);

//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



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