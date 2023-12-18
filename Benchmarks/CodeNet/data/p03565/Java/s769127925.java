
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    String T=gs();
	    String Sq=new String(S);

	    int ind=T.length()-1;
	    boolean f=false;

	    for (int i=0; i<S.length(); i++) {
	    	char c=S.charAt(S.length()-1-i);
	        if (c=='?' || c==T.charAt(T.length()-1)) {
	        	String ns=new String(Sq);
	        	boolean sf =true;
	        	for (int j=0; j<T.length(); j++) {
	        		if (ns.length()-1-i-j<0) {
	        			sf=false;
	        			break;
	        		}
	        		char c2=ns.charAt(ns.length()-1-i-j);
	        		if (c2=='?') {
	        			ns=ns.substring(0, S.length()-1-i-j) + T.charAt(T.length()-1-j) + ns.substring(ns.length()-i-j);
	        	    } else if (c2!=T.charAt(T.length()-1-j)) {
	        	    	sf=false;
	        	    }
	        	}
	        	if(sf) {
	        		f=true;
	        		S=ns;
	        	}
	        }

	    	if(f)break;
	    }
//	    System.out.print(c);
        if (f) {
    	    String a=Sq.substring(0, S.lastIndexOf(T)) + T + Sq.substring(S.lastIndexOf(T)+T.length());
    	    System.out.print(a.replaceAll("\\?", "a"));
        }else {
        	System.out.print("UNRESTORABLE");
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