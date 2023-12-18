import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();
	    //int b=gi();
	    
	    int a=0;
	    for (int i=0; i<4;i++) {
	    	char c=s.charAt(i);
	    	if (c=='+') {
	    		a++;
	    	}else {
	    		a--;
	    	}
	    }

        System.out.println(a);
//        if (a<=8&&b<=8) {
//        	System.out.print("Yay!");
//        }else {
//        	System.out.print(":(");
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