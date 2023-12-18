
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int B=gi();
	    int C=gi();
	    int K=gi();


        //System.out.print(c);
        if (K<A) {
        	System.out.println(K);
        }else if(K<A+B){
        	System.out.println(A);
        } else {
        	System.out.print(A-(K-A-B));
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