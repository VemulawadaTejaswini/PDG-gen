import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String c= gs();

	    if(c.equals("a") || c.equals("i")||c.equals("u")||c.equals("e")||c.equals("o")) {
        System.out.print("vowel");
	    }else {
	    	System.out.print("consonant");
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
}