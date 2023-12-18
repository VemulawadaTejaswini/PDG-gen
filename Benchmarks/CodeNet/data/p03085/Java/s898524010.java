import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String b=gs();


	   
	    	//System.out.print(max);

        if (b.charAt(0)=='A') {
        	System.out.print("T");
        }else if (b.charAt(0)=='C') {
        	System.out.print("G");
        }else if (b.charAt(0)=='G') {
        	System.out.print("C");
        }else if (b.charAt(0)=='T') {
        	System.out.print("A");
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