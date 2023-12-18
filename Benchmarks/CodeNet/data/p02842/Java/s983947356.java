
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    double N=gd();
	    double X=Math.floor(N/1.08);

	    if (Math.floor(X*1.08)==N) {
	    	System.out.println((int)X);
	    } else if (Math.floor((X+1)*1.08)==N)  {
	    	System.out.println((int)(X+1));
	    } else {
	    	System.out.println(":(");
	    }
	    //System.out.println(a);
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