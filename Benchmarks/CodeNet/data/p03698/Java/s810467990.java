
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    Map<String, Integer> m=new HashMap<String, Integer>();

        for(int i=0;i<S.length(); i++) {
        	String s=String.valueOf(S.charAt(i));
        	if(m.containsKey(s)) {
        		System.out.println("no");
        		return;
        	}else {
        		m.put(s, 1);
        	}
	    }
        System.out.println("yes");

        //System.out.println((H-h)*(W-w));
//        if (flg) {
//        	System.out.print("YES");
//        }else {
//        	System.out.print("NO");
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