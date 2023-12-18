import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static int[] C;
	static int[][] A;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a=gi();
	    
        //System.out.println(a[2]-a[0]);
        if (a<1200) {
        	System.out.print("ABC");
        }else if(a<2800){
        	System.out.print("ARC");
        } else {
        	System.out.print("AGC");
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