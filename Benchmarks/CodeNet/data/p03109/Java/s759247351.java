import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();
	    //int b=gi();
	    int m=Integer.parseInt(s.substring(5, 7));
	    //int d=Integer.parseInt(s.substring(7, 9));

        //System.out.println(t/x);
        if (m<=4) {
        	System.out.print("Heisei");
        }else {
        	System.out.print("TBD");
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