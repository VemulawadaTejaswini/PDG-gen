
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
        
        int b=Integer.parseInt(S.substring(0,2));
        int a=Integer.parseInt(S.substring(2,4));

        //System.out.print(v);

        if (b>=1 && b<=12) {
        	if(a>=1 && a<=12) {
        	    System.out.println("AMBIGUOUS");
        	} else {
        		System.out.println("MMYY");
        	}
        }else {
        	if(a>=1 && a<=12) {
        	    System.out.println("YYMM");
        	} else {
        		System.out.println("NA");
        	}
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