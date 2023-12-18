import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    String[] s= new String[n];
	    Map<String, Integer> m=new HashMap<String,Integer>();
	    int c=0;
	    for (int i=0; i<n; i++) {
	    	s[i]=gs();
	    	if (!m.containsKey(s[i])) {
	    		c++;
	    		m.put(s[i], 0);
	    	}
	    }
	   
	  
	    System.out.println(c);
	    
        //System.out.println(Math.pow(l/3, 3));
//        if (a<b) {
//        	System.out.print(Math.max(b-a-w, 0));
//        }else {
//        	System.out.print(Math.max(a-b-w, 0));
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