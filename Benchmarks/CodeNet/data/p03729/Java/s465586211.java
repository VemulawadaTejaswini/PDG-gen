import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String a= gs();
	    String b= gs();
	    String c= gs();

        //System.out.print(aubstring(0,1));
        if (a.charAt(a.length()-1) == b.charAt(0) && b.charAt(b.length()-1) == c.charAt(0)) {
        	System.out.print("YES");
        }else{
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
}