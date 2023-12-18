
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] m=new long[5];
	    String march="MARCH";

	    for (int i=0; i<N; i++) {
	    	String s=gs();
	    	for (int j=0; j<5; j++) {
                char c=march.charAt(j);
                if(s.charAt(0)==c)m[j]++;
	    	}
	    }
	    
	    long sum=0;
	    for (int i=0; i<5; i++) {
	    	for (int j=i+1; j<5; j++) {
	    		for (int k=j+1; k<5; k++) {
	                sum+=m[i]*m[j]*m[k];
		    	}
	    	}
	    }

	    System.out.println(sum);
//        if (f) {
//    	    String a=Sq.substring(0, S.lastIndexOf(T)) + T + Sq.substring(S.lastIndexOf(T)+T.length());
//    	    System.out.print(a.replaceAll("\\?", "a"));
//        }else {
//        	System.out.print("UNRESTORABLE");
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