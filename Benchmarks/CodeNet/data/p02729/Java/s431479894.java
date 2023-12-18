
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int m=gi();
	    
	    int n1=f(n)/f(n-2);
	    int m1=f(m)/f(m-2);

	    System.out.print((n1+m1)/2);

//        if (s.charAt(0)==s.charAt(1) && s.charAt(1)== s.charAt(2)) {
//        	System.out.print("Yes");
//        }else {
//        	System.out.print("No");
//        }


	}

	public static int f(int n) {
		if (n<=1) {
			return 1;
		} else {
			return n* f(n-1);
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