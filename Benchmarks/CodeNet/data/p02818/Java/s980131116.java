
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long A=gl();
	    long B=gl();
	    long K=gl();
	    
       // System.out.print(sb.toString());

        if (A>K) {
        	System.out.println((A-K) + " " + B);
        }else if(A+B>K){
        	System.out.println("0 " + (B-K+A));
        } else {
        	System.out.println("0 0");
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