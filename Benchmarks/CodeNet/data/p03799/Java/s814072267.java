
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long n=gl();
	    long m=gl();

	    //System.out.println(m);
	    if(n>=Math.floorDiv(m, 2)) {
	        System.out.println(Math.floorDiv(m, 2));
	    } else {
	    	long c=n;
	    	m-=2*n;
	    	c+=Math.floorDiv(m, 4);
	    	System.out.println(c);
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