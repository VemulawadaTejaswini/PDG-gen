import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    String s=gs();

        boolean c=false;
        boolean f=false;
        for (int i=0; i<s.length();i++) {
        	if(s.charAt(i)=='C') {
        		c=true;
        	}
        	if(c&& s.charAt(i) =='F') {
        		System.out.println("Yes");
        		return;
        	}
        }
	    System.out.print("No");
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