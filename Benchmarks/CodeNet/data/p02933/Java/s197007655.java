import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a=gi();
	    String s=gs();
	    //int c=gi();

	   
	    //System.out.print(Math.max(a+b, Math.max(a-b, a*b)));

        if (a<3200) {
        	System.out.print(s);
        }else {
        	System.out.print("red");
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