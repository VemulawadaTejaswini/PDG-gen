import java.util.Scanner;
 
public class Main {
 
	static Scanner scanner;
 
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    String az="abcdefghijklmnopqrstuvwxyz";
 
	    String s=gs();
	    
	    //System.out.print(String.valueOf(s.charAt(0))+ (s.length()-2)+s.charAt(s.length()-1));
 
	    String r="None";
	    for (int i=0; i<az.length();i++) {
	    	char c=az.charAt(i);
	    	boolean f= true;
	    	for (int j=0; j<s.length();j++) {
	    		if(s.charAt(j)==c) {
	    			f=false;
	    			break;
	    		}
	    	}
	    	if(f) {
	    		System.out.print(c);
              return;
 
	    	}
	    }
	    
	    System.out.print(r);
 
 
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