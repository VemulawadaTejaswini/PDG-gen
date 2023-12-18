import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a=gi();
	    int b=gi();
	    int x=gi();
	    //String s=gs();

        //System.out.println(Math.min(a, b)+Math.min(c, d));
        if (a<=x && a+b>=x) {
        	System.out.print("YES");
        }else {
        	System.out.print("NO");
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