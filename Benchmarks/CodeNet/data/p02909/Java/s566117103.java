import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    //String s=gs();
	    String t=gs();
	    //int c=gi();

	   
	    //System.out.print(c*c*c);

        if (t.equals("Sunny")) {
        	System.out.print("Cloudy");
        }else if(t.equals("Cloudy")){
        	System.out.print("Rainy");
        } else {
        	System.out.print("Sunny");
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