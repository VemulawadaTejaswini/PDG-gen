import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    long n=gl();
	     
	    long i=0;
	    while(i*i<=n) {
	    	i++;
	    }

	    System.out.print((i-1)*(i-1));
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