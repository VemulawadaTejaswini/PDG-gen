
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    String A=gs();
	    String B=gs();
	    String C=gs();
	    int k=0;
	    for (int i=0; i<N;i++) {
	    	char a=A.charAt(i);
	    	char b=B.charAt(i);
	    	char c=C.charAt(i);
	    	if(a==b && b==c) {
	    		
	    	} else if(a==b || b==c || c==a) {
	    		k+=1;
	    	} else {
	    		k+=2;
	    	}
	    }
//	    if (N<100) {
//	 
//	    } else {
//
//	    }
	    System.out.println(k);
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