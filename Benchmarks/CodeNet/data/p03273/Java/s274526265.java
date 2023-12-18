
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int h=gi();
        int w=gi();
        String[] A=new String[h];
        boolean[] r=new boolean[w];
        for (int i=0; i<w; i++) {
        	r[i]=false;
        }
        for (int i=0; i<h; i++) {
        	A[i]=gs();
        	for (int j=0; j<w; j++) {
        		if (A[i].charAt(j) == '#') {
        			r[j]=true;
        		}
        	}
        }
        
        for (int i=0; i<h; i++) {
        	if (A[i].contains("#")) {
        		StringBuilder sb = new StringBuilder();
        		for (int j=0; j<w; j++) {
            		if (r[j]) {
            			sb.append(A[i].charAt(j));
            		}
            	}
        		System.out.println(sb.toString());
        	}
        }

        //System.out.println(y);
//        if (a>0) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
	}


	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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