import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    long n=gl();
	    long k= gl();
	    
	    long c=n;
	    long a=1;
	    while(c>0) {
	    	c--;
	    	if (a>k) {
	    		a+=k;
	    	} else {
	    		a=2*a;
	    	}
	    }

	    System.out.print(a);
//	    if (s.contains("AC")) {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }


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