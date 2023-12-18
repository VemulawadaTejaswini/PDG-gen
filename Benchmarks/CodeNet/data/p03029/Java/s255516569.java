import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a=gi();
	    int p=gi();
int pp=3*a+p;


	   
	    System.out.print(Math.floorDiv(pp, 2));

//        if (a>12) {
//        	System.out.print(b);
//        }else if(a>5){
//        	System.out.print(b/2);
//        } else {
//        	System.out.print(0);
//        }


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