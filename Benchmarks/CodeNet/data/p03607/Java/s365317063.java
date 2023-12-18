
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N];
	    Map<Long,Boolean> m=new HashMap<Long, Boolean>();
	    for (int i=0; i<N;i++) {
	    	A[i]=gl();
	    	if(m.containsKey(A[i])) {
	    		m.put(A[i], !m.get(A[i]));
	    	} else {
	    		m.put(A[i], true);
	    	}
	    }
	    int c=0;
	    for (Boolean f: m.values()) {
	    	if(f)c++;
	    }
	    System.out.print(c);
//        if (f) {
//    	    System.out.print("Yes");
//        }else {
//        	System.out.print("No");
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