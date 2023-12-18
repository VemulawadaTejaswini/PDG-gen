
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a=gi();
	    int b=gi();

	    //System.out.print(s);

        if ((a==1 && b==2) || (a==2 && b==1)) {
        	System.out.print(3);
        } else if ((a==1 && b==3) || (a==3 && b==1)) {
        	System.out.print(2);
        }else {
        	System.out.print(1);
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