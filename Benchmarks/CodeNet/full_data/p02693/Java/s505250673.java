
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int k=gi();
	    int a=gi();
	    int b=gi();
	    
	    int w=b%k;

	    //System.out.print(nr*2*Math.PI);
	    if (b-w>=a) {
	    	System.out.print("OK");
	    }else {
	    	System.out.print("NG");
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