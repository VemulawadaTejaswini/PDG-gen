
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int H=gi();
	    int W=gi();
	    int k=0;
        for (int i=0; i<H;i++) {
        	String s=gs();
        	for (int j=0; j<W;j++) {
        		char c=s.charAt(j);
        		if(c=='#')k++;
        	}
        }
	    //System.out.println(min);
        if(k==H+W-1) {
        	System.out.println("Possible");
        }else {
        	System.out.println("Impossible");
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