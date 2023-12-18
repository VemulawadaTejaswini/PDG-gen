import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    String s=gs();

        
	    System.out.println(s.substring(0,4) + " " + s.substring(4,12));
//	    if (n%10==3) {
//	    	System.out.print("bon");
//	    }else if(n%10==0 || n%10==1 || n%10==6 || n%10==8){
//	    	System.out.print("pon");
//	    } else {
//	    	System.out.print("hon");
//	    }


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