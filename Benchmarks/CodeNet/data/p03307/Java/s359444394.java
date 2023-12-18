import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static int[] C;
	static int[][] A;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long n=gl();

	    
	  if (n%2==0) {
	    System.out.println(n);
	  } else {
		  System.out.println(2*n);
	  }
	    
        //System.out.println(Math.pow(l/3, 3));
//        if (a<b) {
//        	System.out.print(Math.max(b-a-w, 0));
//        }else {
//        	System.out.print(Math.max(a-b-w, 0));
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