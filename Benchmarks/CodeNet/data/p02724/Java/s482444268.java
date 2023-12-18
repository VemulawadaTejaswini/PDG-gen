
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long X=gl();
	    long a=Math.floorDiv(X, 500);
	    long b=Math.floorDiv(X%500, 5);
	    System.out.print(a*1000+b*5);
//        if (s.equals(s0.reverse().toString()) && s1.toString().equals(s1.reverse().toString()) && s2.toString().equals(s2.reverse().toString())) {
//    	    System.out.print("Yes");
//        }else {
//        	System.out.print("No");
//        }
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