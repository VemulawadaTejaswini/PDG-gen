import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs()+gs()+gs()+gs();

	    //System.out.print((int)Math.pow(4, n));
	    if (S.contains("1") && S.contains("7") && S.contains("9") && S.contains("4")) {
	    	System.out.print("YES");
	    }else {
	    	System.out.print("NO");
	    }



	}

	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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