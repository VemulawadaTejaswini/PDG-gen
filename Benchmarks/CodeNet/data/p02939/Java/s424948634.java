
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    int k=1;
	    String bs=S.substring(0,1);
	    for (int i=1; i<S.length();i++) {
	    	String s=S.substring(i, i+1);
	    	if(s.equals(bs)) {
	    		if(i!=S.length()-1) {
	    			k++;
	    			bs=S.substring(i, i+2);
                  	i++;
	    		}
	    	} else {
	    		k++;
	    		bs=s;
	    	}
	    	
	    }
	    System.out.println(k);
//        if(k%2==0) {
//        	
//		    System.out.println(a-b);
//        } else {
//        	System.out.println(b-a);
//
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