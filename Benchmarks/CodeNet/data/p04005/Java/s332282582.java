
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long A=gl();
	    long B=gl();
	    long C=gl();
	    

	    //System.out.println(min);
        if (A%2==0 || B%2==0 || C%2==0) {
    	    System.out.print(0);
        }else {
        	if(A>=B && A>=C) {
        		System.out.print(B*C);
        	} else if(B>=A && B>=C) {
        		System.out.print(A*C);
        	} else {
        		System.out.print(B*A);
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